package jspTest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "StudentAddServlet", urlPatterns = {"/stuAdd"})
public class StudentAddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		String stuName = request.getParameter("stuName");
		String stuNo = request.getParameter("stuNo");
		String ageStr = request.getParameter("age");
		String scoreStr = request.getParameter("score");
		
		int gender = Integer.parseInt(request.getParameter("gender"));
		int age = Integer.parseInt(ageStr);
		int score = Integer.parseInt(scoreStr);
		
		Student stu = new Student();
		stu.setStuName(stuName);
		stu.setStuNo(stuNo);
		stu.setGender(gender);
		stu.setAge(age);
		stu.setScore(score);
		StuDao sd = new StuDao();
		sd.insert(stu);
		try {
			response.sendRedirect(request.getContextPath()+"/success.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
