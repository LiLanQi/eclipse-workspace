package elAndJstlTest;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstl")
public class JstlServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse res) {
		doPost(request, res);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		List<Student> list = new ArrayList<Student>();
		for (int i = 1; i < 10; i++) {
			list.add(new Student("123"+i,"lilanqi",1,20,100));
		}
		request.setAttribute("list", list);
		try {
			request.getRequestDispatcher("jstl.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
