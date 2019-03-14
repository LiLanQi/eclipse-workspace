package com.lilanqi.jsptest;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;


@WebServlet(name = "UserServlet", urlPatterns = {"/userServlet"})
public class UserServlet extends BaseServlet{
	
	public void change(HttpServletRequest request, HttpServletResponse response) {
		/*char sex = request.getParameter("sex").charAt(0);
		char status = request.getParameter("status").charAt(0);
		char delFlag = request.getParameter("delFlag").charAt(0);
		int userId = Integer.parseInt(request.getParameter("userId"));
		String loginName = request.getParameter("loginName");
		String userName = request.getParameter("userName");
		String email = request.getParameter("email");
		String userType = request.getParameter("userType");
		String password = request.getParameter("password");
		String remark = request.getParameter("remark");
		String phonenumber = request.getParameter("phonenumber");
		User user = new User(userId, loginName, userName, userType, email, phonenumber, sex, password, status, delFlag, remark);*/
		User user = new User();
		Map<String,String[]> mp = request.getParameterMap();
		try {
			BeanUtils.populate(user, mp);
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		}
		System.out.println("调用populate后的user》》》》》  "+user);
		UserDao userdao = new UserDao();
		userdao.changeUser(user);
		try {
			response.sendRedirect("userServlet?method=search");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response) {
		int userId = Integer.parseInt(request.getParameter("userId"));
		UserDao userdao = new UserDao();
		userdao.deleteUser(userId);
		try {
			response.sendRedirect("userServlet?method=search");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void add(HttpServletRequest request, HttpServletResponse response) {
		Map<String,String[]> mp = request.getParameterMap();
		User user = new User();
		try {
			BeanUtils.populate(user, mp);
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		}
		UserDao userdao = new UserDao();
		userdao.addUser(user);
		try {
			response.sendRedirect(request.getContextPath()+"/success.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void search(HttpServletRequest request, HttpServletResponse response) {
		UserDao userdao = new UserDao();
		int userId = 0;
		System.out.println("userID+"+request.getParameter("userId"));
		System.out.println("loginName+"+request.getParameter("loginName"));
		if(!"".equals(request.getParameter("userId")) && request.getParameter("userId")!= null) {
			userId = Integer.parseInt(request.getParameter("userId"));
		}
		String loginName = request.getParameter("loginName");
		User user = new User();
		user.setUserId(userId);
		user.setLoginName(loginName);
		List<User> list = userdao.searchUser(userId, loginName);
		request.setAttribute("list", list);
		request.setAttribute("user", user);
		try {
			request.getRequestDispatcher("user/list.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
