package com.xt.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xt.common.BaseServlet;
import com.xt.impl.UserInfoServiceImpl;
import com.xt.util.SendEmaiUtil;

@WebServlet(name = "RegisterServlet", urlPatterns = {"/register.do"})
public class RegisterServlet extends BaseServlet{
	
	static UserInfoServiceImpl uis = new UserInfoServiceImpl();

	/**
	 * 根据手机号验证码处理用户注册请求
	 * 
	 * @author 李岚祺
	 */
	public void throughPhone(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("进入手机号注册请求servlet");
		String password = request.getParameter("password");
		String passwordRepeat = request.getParameter("passwordRepeat");
		String phone = request.getParameter("phone");
		String code = request.getParameter("code");
		//暂时省略密码不匹配问题
		if (phone != null) {
			boolean isRegister = uis.registerByPhone(password, phone, code);
			if (isRegister) {
				System.out.println("注册成功，正在跳转页面");
			} else {
				System.out.println("注册失败");
			}
		} 
	}
	
	
	/**
	 * 根据发送邮件处理用户注册请求
	 * 
	 * @author 李岚祺
	 */
	public void throughEmail(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("进入邮箱注册请求servlet");
		String password = request.getParameter("password");
		String passwordRepeat = request.getParameter("passwordRepeat");
		String email = request.getParameter("email");
		try {
			SendEmaiUtil.sendEmail(email);
			boolean isRegister = uis.registerByEmail(password, email);
			if (isRegister) {
				System.out.println("注册成功，正在跳转页面");
			} else {
				System.out.println("注册失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
