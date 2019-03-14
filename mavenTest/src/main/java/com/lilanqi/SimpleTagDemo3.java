package com.lilanqi;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagDemo3 extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		JspFragment jspFragment = this.getJspBody();
		StringWriter sw = new StringWriter();
		jspFragment.invoke(sw);
		String content = sw.getBuffer().toString();
		content = content.toUpperCase();
		PageContext pageContext = (PageContext) this.getJspContext();
		pageContext.getOut().write(content);
	}
}
