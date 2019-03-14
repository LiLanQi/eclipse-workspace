package filterTest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class firstFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("firstFilter 结束过滤");
	}
//快捷键的使用？？？？
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("firstFilter 正在过滤");
		filterChain.doFilter(arg0, arg1);
	}

	/**
	 * 当服务器启动时，过滤器就会被初始化
	 * 当服务器关闭时，过滤器会被销毁
	 */
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("firstFilter 开始过滤");
	}



}
