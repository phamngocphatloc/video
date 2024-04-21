package Service;

import security.Auth;
import security.JwtUltils;
import security.Security;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import Dao.UserDao;
import Ultils.JavaMail;
import Ultils.TemplateEmail;
import impls.UserDaoImpls;
import model.User;
import payload.ChangePasswordRequest;
import payload.RegisterRequest;

public class UserServiceImpls implements UserService {

	UserDao userDao;

	public UserServiceImpls() {
		userDao = new UserDaoImpls();
	}

	@Override
	public void register(RegisterRequest registerRequest) {
		System.out.println(registerRequest.getEmail());
		if (registerRequest.getPassword().equals(registerRequest.getReturnPassword())) {
			User userCheck = userDao.findByEmail(registerRequest.getEmail());
			if (userCheck != null) {
				System.out.println(userCheck.getFullName());
				throw new IllegalArgumentException("Tài Khoản Đã Tồn Tại");
			} else {
				if (!registerRequest.getEmail().equals("") && !registerRequest.getPassword().equals("")
						&& !registerRequest.getFullname().equals("")) {
					User user = registerRequest.getUser();
					user.setPassword(Security.hashPassword(user.getPassword()));
					userDao.save(user);
					String emailContent = TemplateEmail.GetTemplateRegister(user.getFullName());
					JavaMail.sendmail(user.getEmail(), emailContent, "Đăng Ký Tài Khoản Thành Công");
				} else {
					throw new IllegalArgumentException("Vui Lòng Nhập Đầy Đủ Thông Tin");
				}
			}
		} else {
			throw new IllegalArgumentException("Nhập Lại Mật Khẩu Không Chính Xác");
		}

	}

	@Override
	public String login(String username, String password) {
		// TODO Auto-generated method stub
		User userCheck = userDao.findByEmail(username);
		if (userCheck == null) {
			throw new IllegalArgumentException("Tài Khoản Không Tồn Tại");
		} else {
			if (Security.EqualsPassword(password, userCheck.getPassword()) == false) {
				throw new IllegalArgumentException("Tài Khoản Mật Khẩu Không Chính Xác");
			} else {
				return JwtUltils.generateToken(userCheck.getEmail());
			}
		}
	}

	@Override
	public int selectTotalPageMyFavorite(User user) {
		User userGet = userDao.findById(user.getUserid());
		System.out.println("All Video Favorite: " + userGet.getFavorites().size());
		int totalPage = (int) Math.ceil(userGet.getFavorites().size() / 8.0);
		System.out.println("Page: " + totalPage);
		return totalPage;
	}

	@Override
	public void updateAccount(User user) {
		userDao.update(user);

	}

	@Override
	public void changePassword(ChangePasswordRequest changePasswordRequest, HttpServletRequest req) {
		if (Auth.isLogin(req) != null) {
			User user = Auth.isLogin(req);
			if (!changePasswordRequest.getNewPassword().equalsIgnoreCase("")) {
				if (Security.hashPassword(changePasswordRequest.getPasswordOld()).equals(user.getPassword())) {
					if (changePasswordRequest.getNewPassword().equals(changePasswordRequest.getReturnPassword())) {
						user.setPassword(Security.hashPassword(changePasswordRequest.getNewPassword()));
						userDao.update(user);
					} else {
						throw new IllegalArgumentException("Nhập Lại Mật Khẩu Không Chính Xác");
					}
				} else {
					throw new IllegalArgumentException("Mật Khẩu Củ Không Chính Xác");
				}
			} else {
				throw new IllegalArgumentException("Vui Lòng Nhập Mật Khẩu Mới");
			}
		}

	}

	@Override
	public List<User> selectUserByPage(int page) {
		// TODO Auto-generated method stub
		return userDao.findByPage(page);
	}

	@Override
	public int getTotalPage() {
		// TODO Auto-generated method stub
		return (int) Math.ceil(userDao.findAll().size()/8.0);
	}

	@Override
	public User selectById(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

}
