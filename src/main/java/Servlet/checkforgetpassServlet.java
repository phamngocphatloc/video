package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import security.Auth;

@WebServlet("/checkforgetpass")
public class checkforgetpassServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (Auth.isLogin(req)==null) {
		String key = req.getParameter("key");
		String email = req.getParameter("email");
		try {
			Auth.checkFogetPassDto(email, key, req);
			req.setAttribute("error", "Mật Khẩu Mới Đã Được Gửi Qua Email Của Bạn");
		}catch (Exception e) {
			req.setAttribute("error", e.getMessage());
		}
		
		req.getRequestDispatcher("/view/login.jsp").forward(req, resp);
		}else {
			resp.sendRedirect("/asm2/home");
		}
	}
	
}
