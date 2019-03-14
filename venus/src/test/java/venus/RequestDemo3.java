package venus;
import java.io.UnsupportedEncodingException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fym")
public class RequestDemo3 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String dept = request.getParameter("dept");
		String[] insts = request.getParameterValues("inst");
		String textarea = request.getParameter("note");
		System.out.println(username);
		System.out.println(password);
		System.out.println(sex);
		System.out.println(dept);
		for (String inst : insts) {
			System.out.println(inst);
		}
		System.out.println(textarea);
	}
}
