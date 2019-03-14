package com.lilanqi.jsptest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.alibaba.druid.pool.DruidDataSource;

public class DBUtil {
	static DruidDataSource druidDataSource;
	private static final String ORACAL_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static final String ORACAL_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String ORACAL_USERNAME = "scott";
	private static final String ORACAL_PASSWORD = "root";
	
	static {
		druidDataSource = new DruidDataSource();
		druidDataSource.setPassword(ORACAL_PASSWORD);
		druidDataSource.setUsername(ORACAL_USERNAME);
		druidDataSource.setDriverClassName(ORACAL_DRIVER);
		druidDataSource.setUrl(ORACAL_URL);
	}
	
	public static DruidDataSource getDruidDataSource() {
		return druidDataSource;
	}
	
	public static void close(Connection connection, Statement statement, ResultSet resultSet) {
		if(resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
