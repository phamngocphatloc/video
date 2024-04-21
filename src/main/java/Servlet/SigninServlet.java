package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.UserService;
import Service.UserServiceImpls;
import security.Auth;

@WebServlet ("/signin")
public class SigninServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (Auth.isLogin(req)==null) {
			req.getRequestDispatcher("/view/login.jsp").forward(req, resp);
		}else {
			resp.sendRedirect("/asm2/home");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		UserService userService = new UserServiceImpls();
		try {
			HttpSession session = req.getSession();
			 session.setAttribute("token", userService.login(email, password));
			 String redirectUrl = (String) session.getAttribute("redirectUrl");
	         if (redirectUrl != null) {
	             resp.sendRedirect(redirectUrl);
	         } else {
	             resp.sendRedirect("/asm2/home"); // Trang mặc định nếu không có trang trước đó
	         }
	
		}catch (Exception e) {
			req.setAttribute("error", e.getMessage());
			req.getRequestDispatcher("/view/login.jsp").forward(req, resp);
		}
		
	}
}
