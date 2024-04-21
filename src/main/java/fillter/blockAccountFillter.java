package fillter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import security.Auth;

@WebFilter ("/*")
public class blockAccountFillter extends HttpFilter {

	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		if (Auth.isLogin(req)==null) {
			chain.doFilter(req, res);
		}else {
			if (Auth.isBlock(req)==false) {
				chain.doFilter(req, res);
			}else {
				req.setAttribute("fullName", Auth.isLogin(req).getFullName());
				req.getSession().removeAttribute("token");
				req.getRequestDispatcher("/view/block.jsp").forward(req, res);
			}
		}
	}
}
