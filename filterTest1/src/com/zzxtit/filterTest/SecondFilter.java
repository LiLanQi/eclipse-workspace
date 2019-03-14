package com.zzxtit.filterTest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class SecondFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("SecondFilter ��ʼ��ʼ��");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("SecondFilter ��ʼ���˲�����");
		
		filterChain.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("SecondFilter ��ʼ��ʼ��");
	}

}
