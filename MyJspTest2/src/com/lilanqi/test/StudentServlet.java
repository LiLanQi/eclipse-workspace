package com.lilanqi.test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

@WebServlet(name = "StudentServlet", urlPatterns = {"/stuServlet"})
public class StudentServlet extends BaseServlet{
	
	public void add(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		Map<String, String[]> map = request.getParameterMap();
		Student student = new Student();
		try {
			BeanUtils.populate(student, map);
		} catch (IllegalAccessException | InvocationTargetException e1) {
			e1.printStackTrace();
		}
		System.out.println(student);
		/*String stuName = request.getParameter("stuName");
		String stuNo = request.getParameter("stuNo");
		int gender = Integer.parseInt(request.getParameter("gender"));
		int age = Integer.parseInt(request.getParameter("age"));
		int score = Integer.parseInt(request.getParameter("score"));
		
		Student student = new Student(stuNo, stuName, gender, age, score);*/
		stuDao studao = new stuDao();
		studao.addStudent(student);
		//为什么这里用相对路径就不会有success界面出现，直接用路径会有,加上/就是端口号后面直接加
		try {
			response.sendRedirect(request.getContextPath()+"/success.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void query(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String stuName = request.getParameter("stuName");
		String stuNo = request.getParameter("stuNo");
		Student student = new Student();
		student.setStuName(stuName);
		student.setStuNo(stuNo);
		stuDao studao = new stuDao();
		List<Student> list = studao.queryStudent(student);
		request.setAttribute("student", student);
		request.setAttribute("list", list);
		try {
			request.getRequestDispatcher("stu/list.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response) {
		String stuNo = request.getParameter("stuNo");
		stuDao studao = new stuDao();
		try {
			studao.deleteStudent(stuNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*try {
			request.getRequestDispatcher("stu/list.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}*/
		//该地方应该跳转到下面的servlet中而不是jsp中，如果跳转到jsp则会爆发空指针
		
		try {
			response.sendRedirect("stuServlet?method=query");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}