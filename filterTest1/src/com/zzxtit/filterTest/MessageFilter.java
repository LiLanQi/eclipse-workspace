package com.zzxtit.filterTest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/doAddTitle")
public class MessageFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		
		String title = request.getParameter("title");
		if(title.indexOf("毛泽东") != -1 ) {
			request.setAttribute("MSG", "同志，你要小心，可以要被查水表！！");
			request.getRequestDispatcher("msg.jsp").forward(request, response);
		}
		System.out.println("==========MessageFilter==========>" + title);
		String content = arg0.getParameter("content");
		System.out.println("==========MessageFilter==========>" + content);
		
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
