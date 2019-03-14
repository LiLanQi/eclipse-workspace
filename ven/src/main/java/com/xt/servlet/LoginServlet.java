package com.xt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xt.userinfo.IUserInfoService;
import com.xt.userinfo.imp.UserInfoService;

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private IUserInfoService userInfoService = new UserInfoService();
	
	/**
	 * 处理用户请求
	 * 
	 * @author 李岚祺
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		if(userInfoService.login(name, password)) {
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("fail.jsp").forward(request, response);
		}
	}
}