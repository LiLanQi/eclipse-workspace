package com.lilanqi.web.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

import com.lilanqi.domain.User;
import com.lilanqi.exception.UserExistException;
import com.lilanqi.service.IUserService;
import com.lilanqi.service.impl.UserService;
import com.lilanqi.util.WebUtils;
import com.lilanqi.web.formbean.RegisterFormBean;

@WebServlet("/register.do")
public class RegisterServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(222);
		RegisterFormBean formbean = WebUtils.request2Bean(request, RegisterFormBean.class);
		boolean flag = formbean.validate();
		if (flag == false) {
			request.setAttribute("formbean", formbean);
			request.getRequestDispatcher("/WEB-INF/pages/register.jsp").forward(request, response);
			return;
		}
		
		User user = new User();
		try {
			ConvertUtils.register(new DateLocaleConverter(), Date.class);
			BeanUtils.copyProperties(user, formbean);
			user.setId(WebUtils.makeId());
			IUserService userService = new UserService();
			userService.registerUser(user);
			String message = String.format(
                    "注册成功！！3秒后为您自动跳到登录页面！！<meta http-equiv='refresh' content='3;url=%s'/>", 
                    request.getContextPath()+"/loginUI.do");
            request.setAttribute("message",message);
            request.getRequestDispatcher("/message.jsp").forward(request,response);
		} catch (UserExistException e) {
			formbean.getErrors().put("userName", "注册用户已存在");
			request.setAttribute("formbean", formbean);
			request.getRequestDispatcher("/WEB-INF/pages/register.jsp").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
