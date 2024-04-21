package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.UserService;
import Service.UserServiceImpls;
import Service.VideoService;
import Service.VideoServiceImpls;
import model.User;
import model.Video;
import security.Auth;

@WebServlet("/favorite")
public class FavoriteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			UserService userService = new UserServiceImpls();
			User userLogin = Auth.isLogin(req);
			int page = 1;
			if (req.getParameter("page") != null) {
				page = Integer.parseInt(req.getParameter("page"));
			}
			VideoService videoservice = new VideoServiceImpls();
			HttpSession session = req.getSession();
			int totalPage = userService.selectTotalPageMyFavorite(userLogin);
			System.out.println("totalpage: "+totalPage);
			List<Video> trending = videoservice.SelectTrending();
			List<Video> listPage;
			if (videoservice.selectByPageandUserFavorite(page, userLogin) != null) {
				listPage = videoservice.selectByPageandUserFavorite(page, userLogin);
			} else {
				listPage = videoservice.selectByPageandUserFavorite(1, userLogin);
			}
			System.out.println("hello");
			for (Video vd : listPage) {
				System.out.println(vd.getTitle());
			}
			req.setAttribute("title", "like");
			req.setAttribute("totalPage", totalPage);
			req.setAttribute("trending", trending);
			req.setAttribute("listvideo", listPage);
			req.getRequestDispatcher("/view/index.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
			int id = Integer.parseInt(req.getParameter("id"));
			VideoService videoservice = new VideoServiceImpls();
			Video vd = videoservice.selectVideoById(id);

			try {
				videoservice.likeVideo(Auth.isLogin(req), vd);
			} catch (Exception e) {
				e.printStackTrace();
				videoservice.UnlikeVideo(Auth.isLogin(req), vd);
			}
			PrintWriter print = resp.getWriter();
			vd = videoservice.selectVideoById(id);
			print.print(vd.getFavorites().size());

	}
}
