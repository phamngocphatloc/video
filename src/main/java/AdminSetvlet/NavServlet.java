package AdminSetvlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import security.Auth;

@WebServlet ("/admin/nav")
public class NavServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("auth", Auth.isLogin(req).getFullName());
		req.getRequestDispatcher("/view/admin/nav.jsp").forward(req, resp);
	}
}
