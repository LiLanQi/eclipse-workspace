package com.lilanqi.web.UI;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerUI.do")
public class RegisterUIServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(111);
		request.getRequestDispatcher("/WEB-INF/pages/register.jsp").forward(request, response);
	}
}
