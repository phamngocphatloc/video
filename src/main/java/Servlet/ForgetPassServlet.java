package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import security.Auth;
import security.ForgetPassDto;

@WebServlet("/forgetpass")
public class ForgetPassServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (Auth.isLogin(req) == null) {
			req.getRequestDispatcher("/view/forgetpass.jsp").forward(req, resp);
		} else {
			resp.sendRedirect("/asm2/home");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		try {
			if (req.getParameter("email") != null) {
				String email = req.getParameter("email");
				ForgetPassDto dto = Auth.forgetPassword(email, req);

				req.setAttribute("error", "Chúng Tôi Đã Gửi Email Vui Lòng Nhấp Vào Link Để Lấy Lại Mật Khẩu");
			} else {
				req.setAttribute("error", "Vui Lòng Nhập Email");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("error", e.getMessage());
		}
		req.getRequestDispatcher("/view/forgetpass.jsp").forward(req, resp);
	}
}
