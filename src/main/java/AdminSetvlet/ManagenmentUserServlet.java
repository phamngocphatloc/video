package AdminSetvlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.gson.Gson;

import Service.UserService;
import Service.UserServiceImpls;
import Service.VideoService;
import Service.VideoServiceImpls;
import model.User;
import model.Video;
import payload.UserRespone;
import payload.VideoRequest;
import payload.VideoRespone;

@WebServlet("/admin/user/*")
public class ManagenmentUserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		UserService userService = new UserServiceImpls();
		HttpSession session = req.getSession();
		List<User> listPage;

		int totalPage = userService.getTotalPage();
		int page = 1;
		if (req.getPathInfo() != null) {
			System.out.println(req.getPathInfo().substring(1));
			page = Integer.parseInt(req.getPathInfo().substring(1));
		}
		if (userService.selectUserByPage(page) != null) {
			listPage = userService.selectUserByPage(page);
		} else {
			listPage = userService.selectUserByPage(1);
		}

		for (User u : listPage) {
			System.out.println(u.getFullName());
		}

		req.setAttribute("title", "new");
		req.setAttribute("totalPage", totalPage);
		req.setAttribute("listUser", listPage);
		req.getRequestDispatcher("/view/admin/managementuser.jsp").forward(req, resp);
	}

	@Override
	@JsonManagedReference
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserService userService = new UserServiceImpls();
		String action = req.getParameter("action");
		VideoService videoservice = new VideoServiceImpls();
		if ("getUser".equals(action)) {
			int userId = Integer.parseInt(req.getParameter("userid"));
			// Tạo đối tượng dữ liệu
			User u = userService.selectById(userId);
			UserRespone respone = new UserRespone(u);
			// Chuyển đối tượng thành JSON
			Gson gson = new Gson();
			String jsonData = gson.toJson(respone);

			// Thiết lập kiểu dữ liệu phản hồi là JSON
			resp.setContentType("application/json");
			resp.setCharacterEncoding("UTF-8");

			// Gửi dữ liệu JSON về client
			PrintWriter out = resp.getWriter();
			out.print(jsonData);
			out.flush();
		} else if ("block".equals(action)) {
			int userId = Integer.parseInt(req.getParameter("userid"));
			User userBlock = userService.selectById(userId);
			if (userBlock.isActive() == true) {
				userBlock.setActive(false);
				userService.updateAccount(userBlock);
				resp.getWriter().print("Khóa Tài Khoản Thành Công");
			}else {
				userBlock.setActive(true);
				userService.updateAccount(userBlock);
				resp.getWriter().print("Mở Tài Khoản Thành Công");
			}
		} else if ("admin".equals(action)) {
			int userId = Integer.parseInt(req.getParameter("userid"));
			User userBlock = userService.selectById(userId);
			if (userBlock.getAdmin() == true) {
				userBlock.setAdmin(false);
				userService.updateAccount(userBlock);
				resp.getWriter().print("Hạ Quyền Admin Thành Công");
			}else {
				userBlock.setAdmin(true);
				userService.updateAccount(userBlock);
				resp.getWriter().print("Nâng Quyền Admin Thành Công");
			}
		} else {
			// Trong trường hợp không xác định hành động nào, chuyển hướng về trang danh
			// sách nhân viên
			resp.sendRedirect("/asm2/admin/user");
		}
	}
}
