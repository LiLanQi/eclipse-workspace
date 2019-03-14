package venus;

import java.io.UnsupportedEncodingException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lilanqi")
public class DoFromServlet1 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("向数据库中插入数据："+username);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		doGet(request, response);
	}
}
