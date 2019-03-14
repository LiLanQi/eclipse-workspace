package com.test.csdn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 数据库连接工具类
 * 
 * @author 李岚祺
 *
 */
public class DBLink {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
/**
 * 获取数据库连接
 * 	
 * author 李岚祺
 */
	private Connection getConnection() {
		String url = "jdbc:oracle:thin:@192.168.3.142:1521:orcl";
		try {
			return DriverManager.getConnection(url,"scott","root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
/**
 * 修改(update,delete,insert)数据
 * 
 * author 李岚祺
 */
	public boolean update(String sql) {
		Connection connection = getConnection();
		Statement statement = null;
		try {
			statement = connection.createStatement();
			int result = statement.executeUpdate(sql);
			return result>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(connection,statement,null);
		}
		return false;
	}
	
/**
 * 修改(update,insert,delete)数据
 * 
 * author 李岚祺
 */
	public void update(String sql,Object...values) {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			for(int i=1;i<=values.length;i++) {
				preparedStatement.setObject(i, values[i-1]);
			}
			rs = preparedStatement.executeQuery();
			if(rs.next()) {
				System.out.println("登陆成功");
			}else {
				System.out.println("登陆失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(connection,preparedStatement,rs);
		}
	}
	
/**
 * 查询数据
 * 
 * author 李岚祺
 */
	public  void select(String sql,IRowMapper rowMapper) {
		ResultSet rs = null;
		Connection connection = getConnection();
		Statement statement = null;
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			rowMapper.rowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(connection,statement,rs);
		}
	}
	
/**
 * 查询数据
 * 
 * author 李岚祺
 */
	public  void select(String sql,IRowMapper rowMapper,Object...values) {
		//2.获取连接
		ResultSet rs = null;
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			for(int i=1;i<=values.length;i++) {
				preparedStatement.setObject(i, values[i-1]);
			}
			rs = preparedStatement.executeQuery(sql);
			rowMapper.rowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(connection,preparedStatement,rs);
		}
	}
	
/**
 * 关闭数据库
 * 
 * author 李岚祺
 */
	private void close(Connection connection,Statement statement,ResultSet rs) {
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
