package venus;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/myy")
public class SessionDemo1Servlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		HttpSession session = request.getSession();
		//摧毁session
		//session.invalidate();
		session.setAttribute("data", "李岚祺");
		String sessionId = session.getId();
		if (session.isNew()) {
			response.getWriter().write("session创建成功， session id是:" + sessionId);
		} else {
			response.getWriter().write("session已经存在，ID是:"+ sessionId);
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
	}
}
