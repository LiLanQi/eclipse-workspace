package com.zzxtit.spring.ioc.first;

public class Course {

	private String name;
	
	private String Teacher;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the teacher
	 */
	public String getTeacher() {
		return Teacher;
	}

	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(String teacher) {
		Teacher = teacher;
	}
	
}
