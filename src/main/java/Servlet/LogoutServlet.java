package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import security.Auth;

@WebServlet ("/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (Auth.isLogin(req)!=null) {
			req.getSession().removeAttribute("token");
			req.getSession().removeAttribute("redirectUrl");
		}
		
		resp.sendRedirect("/asm2/home");
	}
}
