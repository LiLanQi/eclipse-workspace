package jspTest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "StudentListServlet", urlPatterns = {"/stulist"})
public class StudentListServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String StuName = request.getParameter("StuName");
		String StuNo = request.getParameter("StuNo");
		Student student = new Student();
		student.setStuName(StuName);
		student.setStuNo(StuNo);
		StuDao studao = new StuDao();
		List<Student> stuList = studao.getAllStus(student);
		request.setAttribute("stuList", stuList);
		request.setAttribute("Student", student);
		try {
			request.getRequestDispatcher("stu/list.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
