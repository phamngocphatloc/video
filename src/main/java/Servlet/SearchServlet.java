package Servlet;

import java.awt.print.Pageable;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.VideoService;
import Service.VideoServiceImpls;
import model.Video;

@WebServlet ("/search")
public class SearchServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		VideoService videoservice = new VideoServiceImpls();
		HttpSession session = req.getSession();
		String search = "";
		int page = 1;
		if (req.getParameter("search")!=null) {
			search = req.getParameter("search");
		}
		
		if (req.getParameter("page")!=null) {
			page = Integer.parseInt(req.getParameter("page"));
		}
		List<Video> trending = videoservice.SelectTrending();
		List<Video> listPage;
		listPage = videoservice.searchByName(page,search);
		int totalPage = videoservice.selectTotalPageSearch(search);
		
		req.setAttribute("title", "search");
		req.setAttribute("search", search);
		req.setAttribute("totalPage", totalPage);
		req.setAttribute("trending", trending);
		req.setAttribute("listvideo", listPage);
		req.getRequestDispatcher("/view/index.jsp").forward(req, resp);
	}
}
