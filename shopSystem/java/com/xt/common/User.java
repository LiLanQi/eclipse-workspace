package com.xt.common;

import java.util.Date;

/**
 * 用户类
 * 
 * @author 李岚祺
 */
public class User {

	private int id;
	private int sex;
	private String name;
	private String phone;
	private String email;
	private String password;
	private String tempname;
	private Date date;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", sex=" + sex + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ ", password=" + password + ", tempname=" + tempname + ", date=" + date + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTempname() {
		return tempname;
	}

	public void setTempname(String tempname) {
		this.tempname = tempname;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	
	
}
