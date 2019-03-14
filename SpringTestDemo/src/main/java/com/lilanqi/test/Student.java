package com.lilanqi.test;

import java.util.List;

public class Student {
	
	private String stuName;
	
	private List<Course> courseList;
	
	private Teacher teacher;

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", courseList=" + courseList + ", teacher=" + teacher + "]";
	}
	
	
	
	

}
