package com.zzxtit.listener.test;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineNumListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		Object o = arg0.getSession().getServletContext().getAttribute("ONLINENUM");
		Integer onlineNum = 0;
		if(o != null) {
			onlineNum = (Integer) o;
		}
		onlineNum ++;
		arg0.getSession().getServletContext().setAttribute("ONLINENUM", onlineNum);
		System.out.println("sessionID 为：" + arg0.getSession().getId() + "被创建了！"); 
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		Integer onlineNum = (Integer) arg0.getSession().getServletContext().getAttribute("ONLINENUM");
		onlineNum --;
		arg0.getSession().getServletContext().setAttribute("ONLINENUM", onlineNum);
		System.out.println("sessionID 为：" + arg0.getSession().getId() + "被销毁了！");
	}

}
