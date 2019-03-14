package com.test.csdn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@192.168.3.142:1521:orcl";
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		Scanner in = new Scanner(System.in);
		String account = null;
		try {
			connection = DriverManager.getConnection(url,"scott","root");
			statement = connection.createStatement();
			while(true) {
				System.out.println("请输入你需要注册的账号");
				account = in.next();
				String sql = "select * from register where id = '"+account+"'";
				rs = statement.executeQuery(sql);
				if(rs.next()) {
					System.out.println("该用户已经被注册，请重新注册");
				}
				else {
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("请输入你需要注册的账号的密码");
		String password1 = in.next();
		System.out.println("请再次输入你需要注册的账号的密码");
		String password2 = in.next();
		while(!password1.equals(password2)) {
			System.out.println("俩次密码不一致，请重新输入");
			System.out.println("请输入你需要注册的账号的密码");
			password1 = in.next();
			System.out.println("请再次输入你需要注册的账号的密码");
			password2 = in.next();
		}
		String data = null;
		try {
			data = Md5Unit.encrypt((password1).getBytes());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String sql = "insert into register values('"+account+"','"+data+"')";
		try {
			rs = statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("注册成功");
	}
}
