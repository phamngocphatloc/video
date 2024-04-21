package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.VideoService;
import Service.VideoServiceImpls;
import model.Video;
import security.Auth;

@WebServlet("/sharevideo")
public class ShareVideoServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		String email = "";
		int videoId = 0;
		if (req.getParameter("id") != null) {
			 videoId = Integer.parseInt(req.getParameter("id"));
		}

		if (req.getParameter("email") != null) {
			 email = req.getParameter("email");
		}
		System.out.println("id video ne: "+videoId);
		VideoService videoService = new VideoServiceImpls();
		try {
			Video vd = videoService.selectVideoById(videoId);
			videoService.ShareVideo(Auth.isLogin(req),vd,email,req);
			out.print("Share Thành Công Đến "+email);
		}catch (Exception e) {
			out.print(e.getMessage());
			e.getStackTrace();
		}
	}
}
