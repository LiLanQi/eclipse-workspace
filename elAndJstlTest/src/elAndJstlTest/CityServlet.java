package elAndJstlTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/city")
public class CityServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse res) {
		doPost(request, res);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> names = new HashMap<String, String>();
		names.put("lilanqi", "100");
		names.put("fengyuming", "99");
		names.put("qiaozeshuang", "88");
		Map<String, String[]> citys = new HashMap<String, String[]>();
		citys.put("chengdu", new String[] {"1","2","3"});
		citys.put("zhenzhou", new String[] {"4","5","6"});
		citys.put("liaoyuan", new String[] {"7","8","9"});
		request.setAttribute("names", names);
		request.setAttribute("citys", citys);
		try {
			request.getRequestDispatcher("test.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
