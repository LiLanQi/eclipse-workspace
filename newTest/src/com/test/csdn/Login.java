package com.test.csdn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@192.168.3.142:1521:orcl";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String data = null;
		try {
			connection = DriverManager.getConnection(url,"scott","root");
			//statement = connection.createStatement();
			Scanner in = new Scanner(System.in);
			int time = 0;
			while(true) {
				if(time==3) {
					System.out.println("3次匹配不成功，请10分钟后再次登陆");
					break;
				}
				System.out.println("请输入账号");
				String account = in.nextLine();
				System.out.println("请输入密码");
				String password = in.nextLine();
				data = Md5Unit.encrypt((password).getBytes());
				String sql = "select * from register where id = ? and password =?";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setObject(1, account);
				preparedStatement.setObject(2, password);
				rs = preparedStatement.executeQuery();
				if(rs.next()) {
					System.out.println("登陆成功");
					break;
				}
				else {
					time++;
					System.out.println("登陆失败");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null) {
				try {
					preparedStatement.close();
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
	}
}
