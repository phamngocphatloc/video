package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import security.Auth;

@WebServlet ("/nav")
public class NavServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (Auth.isLogin(req)!=null) {
			req.setAttribute("auth", Auth.isLogin(req).getFullName());
		}
		if (Auth.isManager(req)==true) {
			req.setAttribute("admin", Auth.isLogin(req).getFullName());
		}
		req.getRequestDispatcher("/view/nav.jsp").forward(req, resp);
	}
}
