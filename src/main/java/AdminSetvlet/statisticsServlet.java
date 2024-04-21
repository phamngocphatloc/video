package AdminSetvlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.gson.Gson;

import Service.UserService;
import Service.UserServiceImpls;
import Service.VideoService;
import Service.VideoServiceImpls;
import model.User;
import model.Video;
import payload.UserRespone;
import payload.VideoStatisticsRespone;

@WebServlet("/admin/statistics/*")
public class statisticsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VideoService videoservice = new VideoServiceImpls();
		HttpSession session = req.getSession();
		List<Video> listPage;

		int totalPage = videoservice.getTotalPage();
		int page = 1;
		if (req.getPathInfo() != null) {
			System.out.println(req.getPathInfo().substring(1));
			page = Integer.parseInt(req.getPathInfo().substring(1));
		}
		if (videoservice.selectByPage(page) != null) {
			listPage = videoservice.selectByPage(page);
		} else {
			listPage = videoservice.selectByPage(1);
		}
		System.out.println("Danh Sách Video");
		for (Video rp : listPage) {
			System.out.println(rp.getTitle());
		}
		List<VideoStatisticsRespone> listVideo = new ArrayList<VideoStatisticsRespone>();
		listPage.stream().forEach(item -> {
			listVideo.add(new VideoStatisticsRespone(item));
		});
		System.out.println("Danh Sách Statistics");
		for (VideoStatisticsRespone stisticsRespone : listVideo) {
			System.out.println(stisticsRespone.getTitle());
		}
		req.setAttribute("title", "new");
		req.setAttribute("totalPage", totalPage);
		req.setAttribute("listvideo", listVideo);
		req.getRequestDispatcher("/view/admin/statisticsVideo.jsp").forward(req, resp);
	}
	
	
	@Override
	@JsonManagedReference
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserService userService = new UserServiceImpls();
		VideoService videoService = new VideoServiceImpls();
		String action = req.getParameter("action");
		VideoService videoservice = new VideoServiceImpls();
		if ("getStatistics".equals(action)) {
			int videoId = Integer.parseInt(req.getParameter("videoId"));
			// Tạo đối tượng dữ liệu
			Video video = videoService.selectVideoById(videoId);
			VideoStatisticsRespone response = new VideoStatisticsRespone(video);
			// Chuyển đối tượng thành JSON
			Gson gson = new Gson();
			String jsonData = gson.toJson(response);

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
