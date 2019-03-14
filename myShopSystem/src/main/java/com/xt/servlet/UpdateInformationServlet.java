package com.xt.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xt.common.BaseServlet;
import com.xt.impl.UserInfoServiceImpl;

@WebServlet("/updateinformation.do")
public class UpdateInformationServlet extends BaseServlet{
	
	static UserInfoServiceImpl uis = new UserInfoServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String userName2 = request.getParameter("user-name2");
		String name = request.getParameter("name");
		String sex1 = request.getParameter("sex");
		int sex = 1;
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String userName = (String) request.getSession().getAttribute("userName");
		if ("女".equals(sex)) {
			sex = 0;
		}
		String year = request.getParameter("year");
		String mouth = request.getParameter("mouth");
		String day = request.getParameter("day");
		String birth = year+"-"+mouth+"-"+day;
		DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = fmt.parse(birth);
			Timestamp timeStamep = new Timestamp(date.getTime());
			uis.updateUserInformation(userName, userName2, name, sex, timeStamep, email, phone);
			try {
				request.getRequestDispatcher("person/information.jsp").forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
