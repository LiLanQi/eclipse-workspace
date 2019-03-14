package jspTest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "StudentDelServlet", urlPatterns = {"/delStu"})
public class StudentDelServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StuDao studao = new StuDao();
		String stuNo = request.getParameter("stuNo");
		studao.deleteStudent(stuNo);
		response.sendRedirect("stulist");
	}

	
	
	
}
