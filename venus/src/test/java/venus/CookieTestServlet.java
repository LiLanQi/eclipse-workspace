package venus;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/my")
public class CookieTestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			out.write("你上次访问的时间是：");
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if (cookie.getName().equals("lastAccessTime")) {
					Long lastAccessTime = Long.parseLong(cookie.getValue());
					Date date = new Date(lastAccessTime);
					out.write(date.toLocaleString());
				}
			}
		} else {
			out.write("这是你第一次访问本网站");
		}
		
		Cookie cookie = new Cookie("lastAccessTime", System.currentTimeMillis() + "");
		cookie.setMaxAge(24 * 60 * 60);
		response.addCookie(cookie);
	}
	
	  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  doGet(request, response);
	  }
}
