package com.lilanqi.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class stuDao {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(String stuNo) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		String sql = "delete from student where stuNo = '"+stuNo+"'";
		connection = DriverManager.getConnection(PropertiesUtil.getValue("url"), PropertiesUtil.getValue("user_name"), PropertiesUtil.getValue("password"));
		statement = connection.createStatement();
		if(statement.executeUpdate(sql) > 0) {
			System.out.println("删除成功");
		}
	}
	
	public List<Student> queryStudent(Student student) {
		List<Student> list = new ArrayList<Student>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = "select * from student where 1 = 1";
		if(student.getStuName() != null && !"".equals(student.getStuName())) {
			sql += " and stuName like '%"+student.getStuName() + "%'";
		}
		if(student.getStuNo() != null && !"".equals(student.getStuNo())) {
			sql += " and stuNo = '"+student.getStuNo()+"'";
		}
		System.out.println(sql);
		try {
			connection = DriverManager.getConnection(PropertiesUtil.getValue("url"), PropertiesUtil.getValue("user_name"), PropertiesUtil.getValue("password"));
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				student = new Student();//为什么要创建一个新的student对象而不是使用之前的student
				student.setStuName(resultSet.getString(2));
				student.setStuNo(resultSet.getString(1));
				student.setGender(resultSet.getInt(3));
				student.setAge(resultSet.getInt(4));
				student.setScore(resultSet.getInt(5));
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void addStudent(Student student) {
		Connection connection = null;
		Statement statement = null;
		String sql = "insert into student values ('"+student.getStuNo()+"','"+student.getStuName()+"',"+student.getGender()+","+student.getAge()+","+student.getScore()+")";
		try {
			connection = DriverManager.getConnection(PropertiesUtil.getValue("url"), PropertiesUtil.getValue("user_name"), PropertiesUtil.getValue("password"));
			statement = connection.createStatement();
			if(statement.executeUpdate(sql) > 0) {
				System.out.println("数据插入成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
