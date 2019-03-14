package com.it.db.common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;

public class DbUtil {

	private static DruidDataSource dds;
	
	private static final String ORACAL_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static final String ORACAL_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String ORACAL_USERNAME = "scott";
	private static final String ORACAL_PASSWORD = "root";	
	static {
		dds = new DruidDataSource();
		dds.setDriverClassName(MYSQL_DRIVER);
		dds.setUrl(MYSQL_URL);
		dds.setUsername(MYSQL_USERNAME);
		dds.setPassword(MYSQL_PASSWORD);
	}
	
	public static Connection getDBConnection() {
		try {
			return dds.getPooledConnection().getConnection();
		} catch (SQLException e) {
			System.out.println("获取链接失败");
			e.printStackTrace();
		}
		return null;
	}
	
	public static DataSource getDataSource() {
		return dds;
	}
	
	public static void close(Connection conn) throws SQLException {
		if(conn != null) {
			conn.close();
		}
	}
	
	public static void close(Statement stat) throws SQLException {
		if(stat != null) {
			stat.close();
		}
	}
	
	public static void close(ResultSet rs) throws SQLException {
		if(rs != null) {
			rs.close();
		}
	}
	
	public static void close(Connection conn, Statement stat, ResultSet rs) throws SQLException {
		close(conn, stat);
		close(rs);
	}
	
	public static void close(Connection conn, Statement stat) throws SQLException {
		close(stat);
		close(conn);
	}
}
