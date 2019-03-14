package com.xt.util;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 数据库连接工具类
 * 
 * @author 李岚祺
 */
public class DBUtil {
	
	static DruidDataSource druidDataSource;
	private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/mygoods";
	private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	private static final String MYSQL_USERNAME = "root";
	private static final String MYSQL_PASSWORD = "yuankui1209";
	
	static {
		druidDataSource = new DruidDataSource();
		druidDataSource.setPassword(MYSQL_PASSWORD);
		druidDataSource.setUrl(MYSQL_URL);
		druidDataSource.setUsername(MYSQL_USERNAME);
		druidDataSource.setDriverClassName(MYSQL_DRIVER);
	}
	
	public static DruidDataSource getDruidDataSource() {
		return druidDataSource;
	}
	
	public static Connection getConnection() {
		try {
			return druidDataSource.getPooledConnection().getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(Connection connection, Statement statement, ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (statement != null) {
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
