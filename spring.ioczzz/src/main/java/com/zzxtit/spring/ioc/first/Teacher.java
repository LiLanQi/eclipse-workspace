package com.zzxtit.spring.ioc.first;

public class Teacher {

	
	private String teaName;

	/**
	 * @return the teaName
	 */
	public String getTeaName() {
		return teaName;
	}

	/**
	 * @param teaName the teaName to set
	 */
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teacher [teaName=" + teaName + "]";
	}
	
	
	
	
}
