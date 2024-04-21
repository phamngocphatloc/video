package fillter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import security.Auth;
@WebFilter ("/admin/*")
public class adminFillter extends HttpFilter {
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		if (Auth.isManager(req)==true) {
			chain.doFilter(req, res);
		}else {
			res.sendRedirect("/asm2/home");
		}
	}
}
