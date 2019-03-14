package filterTest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncoding implements Filter{

	private String encoding = "utf-8";
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("开始配置字符集");
		arg0.setCharacterEncoding(encoding);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		String encoding = arg0.getInitParameter("encoding");
		if (encoding != null && "".equals(encoding)) {
			this.encoding = encoding;
		}
	}

}
