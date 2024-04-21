package AdminSetvlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.gson.Gson;

import Service.VideoService;
import Service.VideoServiceImpls;
import model.Video;
import payload.VideoRequest;
import payload.VideoRespone;

@WebServlet("/admin/video/*")
@MultipartConfig
public class ManagenmentVideoServlet extends HttpServlet {
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

		req.setAttribute("title", "new");
		req.setAttribute("totalPage", totalPage);
		req.setAttribute("listvideo", listPage);
		req.getRequestDispatcher("/view/admin/managementvideo.jsp").forward(req, resp);
	}

	@Override
	@JsonManagedReference
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VideoService videoservice = new VideoServiceImpls();
		String action = req.getParameter("action");

		if ("getvideo".equals(action)) {
			int videoId = Integer.parseInt(req.getParameter("videoid"));
			// Tạo đối tượng dữ liệu
			Video vd = videoservice.selectVideoById(videoId);
			VideoRespone respone = new VideoRespone(vd);
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
		} else if ("add".equals(action)) {
			VideoRequest request = new VideoRequest();
			// Đọc tham số vào các thuộc tính của bean staff
			try {
				BeanUtils.populate(request, req.getParameterMap());
			} catch (IllegalAccessException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			File dir = new File(req.getServletContext().getRealPath("/files"));
			if (!dir.exists()) { // tạo nếu chưa tồn tại
				dir.mkdirs();
			}
			Part photo = req.getPart("Fileposter");

			File photoFile = new File(dir, photo.getSubmittedFileName());
			String filePath = "http://localhost:8080/asm2/files/"+photoFile.getName();
			// Chia sẻ với result.jsp
			photo.write(photoFile.getAbsolutePath());
			request.setPoster(filePath);
			
			videoservice.AddVideo(request);
			resp.getWriter().print("Them Thành Công");
		} else if ("edit".equals(action)) {
			Video video = new Video();
			VideoRequest request = new VideoRequest();
			// Đọc tham số vào các thuộc tính của bean staff
			try {
				BeanUtils.populate(request, req.getParameterMap());
				video = videoservice.selectVideoById(request.getVideoid()); 
				video.setDescription(request.getDescription());
				video.setTitle(request.getTitle());
				video.setUrl(request.getUrl());
			} catch (IllegalAccessException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			File dir = new File(req.getServletContext().getRealPath("/files"));
			if (!dir.exists()) { // tạo nếu chưa tồn tại
				dir.mkdirs();
			}
			Part photo = req.getPart("Fileposter");

			File photoFile = new File(dir, photo.getSubmittedFileName());
			String filePath = "http://localhost:8080/asm2/files/"+photoFile.getName();
			// Chia sẻ với result.jsp
			photo.write(photoFile.getAbsolutePath());
			video.setPoster(filePath);
			
			videoservice.updateVideo(video);
			resp.getWriter().print("Sửa Thành Công");
		} else if ("delete".equals(action)) {
			System.out.print("Video Id: "+req.getParameter("videoId"));
				int videoId = Integer.parseInt(req.getParameter("videoId"));
				Video video = videoservice.selectVideoById(videoId);
				videoservice.deleteVideo(video);
				resp.getWriter().print("Xóa Thành Công");
		} else {
			// Trong trường hợp không xác định hành động nào, chuyển hướng về trang danh
			// sách nhân viên
			resp.sendRedirect("/asm2/admin/video");
		}
	}
}
