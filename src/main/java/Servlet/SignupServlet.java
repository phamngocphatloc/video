package Servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.fasterxml.jackson.databind.util.BeanUtil;

import Service.UserService;
import Service.UserServiceImpls;
import payload.RegisterRequest;
import security.Auth;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (Auth.isLogin(req) == null) {
			req.getRequestDispatcher("/view/register.jsp").forward(req, resp);
		} else {
			resp.sendRedirect("/home");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		// TODO Auto-generated method stub
		RegisterRequest registerRequest = new RegisterRequest();
		UserService userService = new UserServiceImpls();
		try {
			BeanUtils.populate(registerRequest, req.getParameterMap());
			try {
				userService.register(registerRequest);
				req.setAttribute("error", "Đăng Ký Thành Công Vui Lòng Đăng Nhập");
				req.getRequestDispatcher("/view/login.jsp").forward(req, resp);
			}catch (Exception e) {
				req.setAttribute("error", e.getMessage());
				req.getRequestDispatcher("/view/register.jsp").forward(req, resp);
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
