package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "ServletConfigDemoServlet", urlPatterns = {"/servletConfigDemo"}, initParams = {
		@WebInitParam(name = "admin", value = "Harry Taciak"),
		@WebInitParam(name = "email", value = "admin@example.com")
})
public class ServletConfigDemoServlet implements Servlet {

	private transient ServletConfig servletConfig;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		this.servletConfig = servletConfig;
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String admin = servletConfig.getInitParameter("admin");
		String email = servletConfig.getInitParameter("email");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head></head><body>" + "Admin:" + admin +"</br>Email:"+email+"</body></hetml>");
	}

}
