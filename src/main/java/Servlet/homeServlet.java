package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.UserDao;
import Dao.VideoDao;
import Service.VideoService;
import Service.VideoServiceImpls;
import Ultils.Cookies;
import impls.UserDaoImpls;
import impls.VideoImpls;
import model.*;


@WebServlet ({"/home","/home/*"})
public class homeServlet extends HttpServlet{
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
		List<Video> trending = videoservice.SelectTrending();
		if (videoservice.selectByPage(page)!=null) {
			listPage = videoservice.selectByPage(page);
		}else {
			listPage = videoservice.selectByPage(1);
		} 
		
		req.setAttribute("title", "new");
		req.setAttribute("totalPage", totalPage);
		req.setAttribute("trending", trending);
		req.setAttribute("listvideo", listPage);
		req.getRequestDispatcher("/view/index.jsp").forward(req, resp);
	}
	
	
	

}
