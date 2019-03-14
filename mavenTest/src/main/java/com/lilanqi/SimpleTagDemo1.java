package com.lilanqi;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagDemo1 extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		JspFragment jspFragment = this.getJspBody();
		
		jspFragment.invoke(null);
	}

	
}
