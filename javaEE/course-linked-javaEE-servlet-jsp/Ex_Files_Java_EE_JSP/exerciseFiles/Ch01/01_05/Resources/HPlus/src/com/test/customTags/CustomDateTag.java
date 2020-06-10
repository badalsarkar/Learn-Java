package com.test.customTags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomDateTag extends SimpleTagSupport {

	private String format;
	private Date date;

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public void doTag() throws JspException, IOException {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		PageContext pageContext = (PageContext) getJspContext();
		JspWriter writer = pageContext.getOut();
		writer.println(formatter.format(date));

	}

}
