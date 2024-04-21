package Servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import Service.UserService;
import Service.UserServiceImpls;
import payload.ChangePasswordRequest;

@WebServlet ("/changepassword")
public class ChangePasswordServlet extends HttpServlet {
	UserService userService = new UserServiceImpls();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/view/ChangePassword.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ChangePasswordRequest request = new ChangePasswordRequest();
		try {
			BeanUtils.populate(request, req.getParameterMap());
			userService.changePassword(request, req);
			req.setAttribute("error", "Đổi Mật Khẩu Thành Công");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			req.setAttribute("error", e.getMessage());
		}
		req.getRequestDispatcher("/view/ChangePassword.jsp").forward(req, resp);
		
		
	}
}
