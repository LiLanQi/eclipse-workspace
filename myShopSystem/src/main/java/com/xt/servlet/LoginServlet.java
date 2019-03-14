package com.xt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xt.common.BaseServlet;
import com.xt.common.User;
import com.xt.impl.UserInfoServiceImpl;
import com.xt.util.ChechEmailAndMobile;

public class LoginServlet extends BaseServlet{
	
	static UserInfoServiceImpl uis = new UserInfoServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
	}
	
	/**
	 * 处理用户登陆请求
	 * 
	 * @author 李岚祺
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("进入登陆");
		String msg = "";
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if ("".equals(userName) || "".equals(password) || userName == null || password == null) {
			msg = "用户名或密码不能为空";
		} else {
			List<User> list;
			if (ChechEmailAndMobile.clickMail(userName)) {
				list =  uis.loginByEmail(userName, password);
			} else if (ChechEmailAndMobile.clickMobile(userName)) {
				list =  uis.loginByMobile(userName, password);
			} else {
				list =  uis.loginById(userName, password);
			}
			if (!list.isEmpty()) {
				System.out.println(list);
				User user = (User) list.get(0);
				if (user.getPassword().equals(password)) {
					try {
						request.getSession().setAttribute("userName", user.getId());
						request.getRequestDispatcher("home2.jsp").forward(request, response);
					} catch (ServletException e) {
						e.printStackTrace();
					}
				}
			} else {
				msg = "用户名不存在或密码不正确";
			}
			
		} 
		if (!"".equals(msg)) {
			request.removeAttribute("msg");
			request.setAttribute("msg", msg);
			try {
				request.getRequestDispatcher("home/login.jsp").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			}
		}
	}
}
