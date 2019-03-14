import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login.do"})
public class LoginServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
	}
	
	@Test
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if ("root".equals(userName)) {
			request.getSession().setAttribute("userInfo", userName);
			response.sendRedirect("jsp/main.jsp");
		} else {
			request.setAttribute("msg", "用户名或密码错误");
			try {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			}
		}
	}
}
