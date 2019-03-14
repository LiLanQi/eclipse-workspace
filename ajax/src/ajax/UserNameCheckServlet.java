package ajax;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/checkUserName")
public class UserNameCheckServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html; charset=UTF-8");
		String userName = request.getParameter("username");
		//System.out.println(userName);
		
		Message msg = new Message();
		msg.setCode("0000");
		msg.setMsg("用户名已经存在233");
		
		String MSG = new Gson().toJson(msg);
		System.out.println("------>"+MSG);
		
		
		try {
			response.getWriter().write(MSG);
			//response.getWriter().write("username 已经存在");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
