package com.lilanqi.jsptest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void changeUser(User user) {
		Connection connection = null;
		Statement statement = null;
		String sql = "update sys_user set login_name='"+user.getLoginName()+"', user_name='"+user.getUserName()+"', user_type='"+user.getUserType()+"', email='"+user.getEmail()+"', phonenumber='"+user.getPhonenumber()+"', sex='"+user.getSex()+"', password='"+user.getPassword()+"', status='"+user.getStatus()+"', del_flag='"+user.getDelFlag()+"', remark='"+user.getRemark()+"', birthday='"+user.getBirthday()+"' where user_id='"+user.getUserId()+"'";
		System.out.println("修改的sql语句"+sql);
		try {
			connection = DriverManager.getConnection(PropertiesUtil.getValue("url"), PropertiesUtil.getValue("user_name"), PropertiesUtil.getValue("password"));
			statement = connection.createStatement();
			if(statement.executeUpdate(sql)>0) {
				System.out.println("修改成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteUser(int userId){
		Connection connection = null;
		Statement statement = null;
		String sql = "delete from sys_user where user_id = '"+userId+"'";
		try {
			connection = DriverManager.getConnection(PropertiesUtil.getValue("url"), PropertiesUtil.getValue("user_name"), PropertiesUtil.getValue("password"));
			statement = connection.createStatement();
			if(statement.executeUpdate(sql) > 0) {
				System.out.println("删除成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<User> searchUser(int userId, String loginName) {
		List<User> list = new ArrayList<>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = "select * from sys_user where 1 = 1";
		if(userId != 0 && !"".equals("userId")) {
			sql += " and user_id = "+userId+"";
		}
		if(loginName != null && !"".equals("loginName")) {
			sql += " and login_name like '%"+loginName + "%'";
		}
		System.out.println("用户名"+userId);
		System.out.println(sql);
		try {
			connection = DriverManager.getConnection(PropertiesUtil.getValue("url"), PropertiesUtil.getValue("user_name"), PropertiesUtil.getValue("password"));
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				User user = new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7).charAt(0), resultSet.getString(8), resultSet.getString(9).charAt(0), resultSet.getString(10).charAt(0), resultSet.getString(11), resultSet.getDate(12));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("查找成功");
		return list;
	}

	public void addUser(User user) {
		Connection connection = null;
		Statement statement = null;
		String sql = "insert into sys_user values ("+user.getUserId()+", '"+user.getLoginName()+"', '"+user.getUserName()+"', '"+user.getUserType()+"', '"+user.getEmail()+"', '"+user.getPhonenumber()+"', '"+user.getSex()+"', '"+user.getPassword()+"', '"+user.getStatus()+"', '"+user.getDelFlag()+"', '"+user.getRemark()+"', '"+user.getBirthday()+"' )";
		System.out.println(sql);
		try {
			connection = DriverManager.getConnection(PropertiesUtil.getValue("url"), PropertiesUtil.getValue("user_name"), PropertiesUtil.getValue("password"));
			statement = connection.createStatement();
			if(statement.executeUpdate(sql) > 0) {
				System.out.println("录入用户信息成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
