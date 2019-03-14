package com.java.model;

public class Teacher {

	private int tnum;
	private String tname;
	private String colleage;
	private String course;
	private String sex;
	private String tdate;
	
	public int getTnum() {
		return tnum;
	}
	public void setTnum(int tnum) {
		this.tnum = tnum;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getColleage() {
		return colleage;
	}
	public void setColleage(String colleage) {
		this.colleage = colleage;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public Teacher(String tname, String colleage, String course, String sex, String tdate) {
		super();
		
		this.tname = tname;
		this.colleage = colleage;
		this.course = course;
		this.sex = sex;
		this.tdate = tdate;
	}
	public Teacher() {
		super();
	}
	
}
