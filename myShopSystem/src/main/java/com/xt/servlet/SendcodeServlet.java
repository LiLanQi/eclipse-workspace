package com.xt.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xt.util.SMSUtils;

@WebServlet("/sendCode.do")
public class SendcodeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static String templateId = "9424065";
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phone = request.getParameter("phone");
		System.out.println("正在对手机号" + phone + "发送验证码");
		if(phone != null) {
			SMSUtils.sendCode(phone, templateId);
		} else {
			System.out.println("手机号不能为空");
		}
		
	}
}
