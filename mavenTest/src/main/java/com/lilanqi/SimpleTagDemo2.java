package com.lilanqi;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagDemo2 extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		JspFragment jspFrament = this.getJspBody();
		for (int i = 0; i < 5; i++) {
			jspFrament.invoke(null);
		}
	}
}
