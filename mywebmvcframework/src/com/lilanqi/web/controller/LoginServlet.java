package com.lilanqi.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lilanqi.domain.User;
import com.lilanqi.service.IUserService;
import com.lilanqi.service.impl.UserService;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String passWd = request.getParameter("password");
		IUserService userService =  new UserService();
		User user = userService.loginUser(userName, passWd);
		if (user == null) {
			String message = String.format("对不起，您输入的密码有误，2秒后为您自动跳转到登陆页面<meta http-equiv='refresh' content='2;url=%s'/>", request.getContextPath()+"/loginUI.do");
			request.setAttribute("message", message);
			request.getRequestDispatcher("/message.jsp").forward(request, response);
			return;
		}
		request.getSession().setAttribute("user", user);
		String message = String.format("登陆%s成功，2秒后为您自动跳转到首页<meta http-equiv='refresh' content='2;url=%s'/>", user.getUserName(), request.getContextPath()+"/index.jsp");
		request.setAttribute("message", message);
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}
}
