package myFilterAndListenerTest;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineNumListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("SessionId为"+arg0.getSession().getId() + "被创建了");
		Object o = arg0.getSession().getServletContext().getAttribute("ONLINENUM");
		int onlineNum = 0;
		if (o != null || "".equals(o)) {
			onlineNum = (int) o;
		}
		onlineNum++;
		arg0.getSession().getServletContext().setAttribute("ONLINENUM", onlineNum);
		System.out.println("当前人数===="+onlineNum);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("SessionId为"+arg0.getSession().getId() + "被销毁了");
		int onlineNum = (int) arg0.getSession().getServletContext().getAttribute("ONLINENUM");
		onlineNum--;
		arg0.getSession().getServletContext().setAttribute("ONLINENUM", onlineNum);
		System.out.println("当前人数===="+onlineNum);
	}

}
