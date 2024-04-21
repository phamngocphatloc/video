package security;

import java.util.Random;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.UserDao;
import Ultils.Cookies;
import Ultils.JavaMail;
import Ultils.TemplateEmail;
import impls.UserDaoImpls;
import model.User;
import net.bytebuddy.implementation.bytecode.Throw;

public class Auth {
	public static User isLogin(HttpServletRequest req) {
		UserDao userDao = new UserDaoImpls();
		if (req.getSession().getAttribute("token") != null) {
			User user = userDao
					.findByEmail(JwtUltils.getSubjectFromToken(String.valueOf(req.getSession().getAttribute("token"))));
			return user;
		}
		return null;
	}

	public static boolean isManager(HttpServletRequest req) {
		if (isLogin(req) != null) {

			if (isLogin(req).getAdmin() == true) {
				return true;
			}
		}
		return false;
	}

	public static void LogOut(HttpServletRequest req) {
		if (isLogin(req) != null) {
			HttpSession session = req.getSession();
			session.removeAttribute("token");
		}
	}

	public static boolean Authencate(HttpServletRequest req, HttpServletResponse rp) {
		if (isLogin(req) != null) {
			return true;
		} else {
			HttpSession session = req.getSession();
			if (session.getAttribute("redirectUrl") != null) {
				session.removeAttribute("redirectUrl");
			}
			session.setAttribute("redirectUrl", req.getRequestURL().toString());
			return false;
		}
	}
	

	public static String getRandomNumber(int len) {
		java.util.Random rnd = new Random();
		String chars = "0123456789QWERRTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		}
		return sb.toString();
	}

	public static ForgetPassDto forgetPassword(String email, HttpServletRequest rq) {
		HttpSession session = rq.getSession();
		UserDao userDao = new UserDaoImpls();
		if (userDao.findByEmail(email) != null) {
			ForgetPassDto forgetPassDto = new ForgetPassDto();
			forgetPassDto.setEmail(email);
			forgetPassDto.setKey(getRandomNumber(15));
			if (session.getAttribute("forgetpass") != null) {
				session.removeAttribute("forgetpass");
			}

			session.setAttribute("forgetpass", forgetPassDto);
			String link = "http://localhost:8080/asm2/checkforgetpass?key=" + forgetPassDto.getKey() + "&email="
					+ forgetPassDto.getEmail();
			String emailContent = TemplateEmail.getEmailForgetPass(link);
			JavaMail.sendmail(forgetPassDto.getEmail(), emailContent, "Yêu Cầu Lấy Lại Mật Khẩu");
			return forgetPassDto;
		} else {
			throw new IllegalArgumentException("Tài Khoản Không Tồn Tại");
		}
	}

	public static void checkFogetPassDto(String email, String key, HttpServletRequest rq) {
		HttpSession session = rq.getSession();
		UserDao userDao = new UserDaoImpls();
		if (session.getAttribute("forgetpass") != null) {
			ForgetPassDto dtoSave = (ForgetPassDto) session.getAttribute("forgetpass");
			if (dtoSave.getEmail().equals(email) && dtoSave.getKey().equals(key)) {
				User user = userDao.findByEmail(email);
				String newPassword = getRandomNumber(10);
				user.setPassword(security.Security.hashPassword(newPassword));
				userDao.update(user);
				String emailContent = TemplateEmail.getEmailForgetPassSuccess(newPassword);
				JavaMail.sendmail(user.getEmail(), emailContent, "Mật Khẩu Mới - PLTUBE");
				session.removeAttribute("forgetpass");
			} else {
				throw new IllegalArgumentException("Đường Link Không Hợp Lệ");
			}
		} else {
			throw new IllegalArgumentException("Đường Link Không Hợp Lệ");
		}
	}
	
	public static boolean isBlock (HttpServletRequest req) {
		if (isLogin(req) != null) {

			if (isLogin(req).isActive() == false) {
				return true;
			}
		}
		return false;
	}
}
