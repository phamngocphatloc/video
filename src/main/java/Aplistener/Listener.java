package Aplistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class Listener implements ServletContextListener, HttpSessionListener {
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		//chay truoc khi ung dung bi sutdown
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		//chay sau khi start thanh cong
	}
	
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		//chay truoc khi phien lam viec
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		//chay sau khi phien lam viec
		
	}

}
