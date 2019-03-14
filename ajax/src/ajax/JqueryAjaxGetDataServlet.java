package ajax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/jqueryAjaxGetData.do")
public class JqueryAjaxGetDataServlet extends HttpServlet{

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html; charset=UTF-8");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		System.out.println("userName---------->" + userName);
		System.out.println("password---------->" + password);
		
		List<Message> list = new ArrayList<Message>();
		list.add(new Message("200", "执行成功"));
		list.add(new Message("404", "找不到页面"));
		list.add(new Message("5xx", "服务器没找到"));
		
		try {
			response.getWriter().write(new Gson().toJson(list));
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
