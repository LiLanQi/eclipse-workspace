package com.zzxtit.filterTest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * 
 * @author zzxt
 *
 */
public class FirstFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("firstFilter ��ʼ������");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("firstFilter ��ʼ���ˡ���������");
		arg0.setCharacterEncoding("utf-8");
		
		filterChain.doFilter(arg0, arg1);
	}

	/**
	 * ������������ʱ���������ͻᱻ��ʼ��
	 * ���������ر�ʱ���������ᱻ����
	 */
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("firstFilter ��ʼ��ʼ��");
	}

}
