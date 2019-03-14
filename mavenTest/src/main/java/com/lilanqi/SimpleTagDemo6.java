package com.lilanqi;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagDemo6 extends SimpleTagSupport{

	private Date date;
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void doTag() throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		this.getJspContext().getOut().write(sdf.format(date));
	}
}
