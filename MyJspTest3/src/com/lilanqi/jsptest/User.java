package com.lilanqi.jsptest;

import java.util.Date;

public class User {
	private int userId;
	private String loginName;
	private String userName;
	private String userType;
	private String email;
	private String phonenumber;
	private char sex;
	private String password;
	private char status;
	private char delFlag;
	private String remark;
	private Date birthday;
	
	public User() {
		
	}

	public User(int userId, String loginName, String userName, String userType, String email, String phonenumber,
			char sex, String password, char status, char delFlag, String remark, Date birthday) {
		super();
		this.userId = userId;
		this.loginName = loginName;
		this.userName = userName;
		this.userType = userType;
		this.email = email;
		this.phonenumber = phonenumber;
		this.sex = sex;
		this.password = password;
		this.status = status;
		this.delFlag = delFlag;
		this.remark = remark;
		this.birthday = birthday;
	}

	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public char getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(char delFlag) {
		this.delFlag = delFlag;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", loginName=" + loginName + ", userName=" + userName + ", userType="
				+ userType + ", email=" + email + ", phonenumber=" + phonenumber + ", sex=" + sex + ", password="
				+ password + ", status=" + status + ", delFlag=" + delFlag + ", remark=" + remark + ", birthday="
				+ birthday + "]";
	}
}
