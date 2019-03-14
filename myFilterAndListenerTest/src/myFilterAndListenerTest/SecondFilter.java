package myFilterAndListenerTest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class SecondFilter implements Filter{

	private String encoding = "utf-8";
	@Override
	public void destroy() {
		System.out.println("SecondFilter 开始销毁");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("SecondFilter 正在过滤 同时开始设置字符集");
		arg0.setCharacterEncoding(encoding);
		filterChain.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("SecondFilter 开始初始化");
		String encoding = arg0.getInitParameter("encoding");
		System.out.println("encoding>>>>>>>>"+encoding);
		if (encoding != null && "".equals(encoding)) {
			this.encoding = encoding;
		}
	}

}
