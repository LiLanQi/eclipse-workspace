package com.test.csdn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@192.168.3.142:1521:orcl";
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection(url,"scott","root");
			statement = connection.createStatement();
			Scanner in =  new Scanner(System.in);
			System.out.println("请输入身份证号");
			String id_card = in.next();
			String sql = "select * from user_information where id_card = '"+id_card+"'";
			rs = statement.executeQuery(sql);
			if(rs.next()) {
				String birth = id_card.substring(6, 14);
				LocalDate date = LocalDate.now();
				int year = date.getYear();
				int month = date.getMonthValue();
				int today = date.getDayOfMonth();
				int age = (year*365+month*30+today-Integer.parseInt(birth.substring(0,4))*365-Integer.parseInt(birth.substring(4,6))*30-Integer.parseInt(birth.substring(6,8)))/365;
				String last = id_card.substring(17,18);
				if((Integer.parseInt(last)&1)!=0) {
					System.out.println("性别女");
				}else {
					System.out.println("性别男");
				}
				System.out.println("年龄为"+age);
			}else {
				System.out.println("查无此人");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
		
	}
}
