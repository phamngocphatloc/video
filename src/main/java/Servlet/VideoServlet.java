package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.VideoService;
import Service.VideoServiceImpls;
import model.Video;

@WebServlet("/watch/*")
public class VideoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VideoService videoService = new VideoServiceImpls();
		if (req.getPathInfo() != null) {
			System.out.println(req.getPathInfo().substring(1));
			int id = Integer.parseInt(req.getPathInfo().substring(1));
			if (videoService.selectVideoById(id) != null) {
				List<Video> list = videoService.selectByPage(1);
				List<Video> trending = videoService.SelectTrending();
				req.setAttribute("video", videoService.selectVideoById(id));
				req.setAttribute("ListVideo", list);
				req.setAttribute("trending", trending);
				req.getRequestDispatcher("/view/VideoPost.jsp").forward(req, resp);
			} else {
				resp.sendRedirect("/asm2/home");
			}
		} else {
			resp.sendRedirect("/asm2/home");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("utf-8");
		VideoService videoService = new VideoServiceImpls();
		System.out.println(req.getPathInfo().substring(1));
		int id = Integer.parseInt(req.getPathInfo().substring(1));
		videoService.SeenVideo(videoService.selectVideoById(id));
		Video video = videoService.selectVideoById(id);
		System.out.print(video.getViews());
		PrintWriter print = resp.getWriter();
		print.write(String.valueOf(video.getViews()));

	}
}
