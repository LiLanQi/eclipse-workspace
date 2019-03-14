package jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBLink {
	
	/**
 	* 加载类驱动
 	*/
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 连接数据库
	 * 
	 * author 李岚祺
	 */
	private Connection getConnection() {
		try {
			return DriverManager.getConnection(PropertiesUtil.getValue("url"), PropertiesUtil.getValue("user_name"), PropertiesUtil.getValue("password"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 批量修改数据
	 * 
	 * author 李岚祺
	 */
	public boolean batchUpdate(String...sqls) {
		Connection connection = getConnection();
		Statement statement = null;
		try {
			connection.setAutoCommit(false);
			statement = connection.createStatement();
			for (String sql : sqls) {
				statement.executeUpdate(sql);
			}
			connection.commit();
			return true;
		} catch (SQLException e) {
			if(connection!=null) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}finally {
			close(connection,statement,null);
		}
		return false;
	}
	
	/**
	 * 更新数据
	 * 
	 * author 李岚祺
	 */
	public boolean update(String sql) {
		Connection connection = getConnection();
		Statement statement = null;
		try {
			statement = connection.createStatement();
			int resultSet = statement.executeUpdate(sql);
			return resultSet>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(connection,statement,null);
		}
		return false;
	}
	
	/**
	 * 更新数据
	 * 
	 * author 李岚祺
	 */	
	public boolean update(String sql,Object...values) {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			for(int i=1;i<=values.length;i++) {
				preparedStatement.setObject(i, values[i-1]);
			}
			int resultSet = preparedStatement.executeUpdate();
			return resultSet>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(connection,preparedStatement,null);
		}
		return false;
	}
	
	public void select(String sql,IRowMapper RowMapper) {
		Connection connection = getConnection();
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			RowMapper.RowMapper(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(connection,statement,resultSet);
		}
	}

	/**
	 * 更新数据
	 * 
	 * author 李岚祺
	 */	
	public void select(String sql,IRowMapper RowMapper,Object...values) {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			for(int i=1;i<=values.length;i++) {
				preparedStatement.setObject(i, values[i-1]);
			}
			resultSet = preparedStatement.executeQuery();
			RowMapper.RowMapper(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(connection,preparedStatement,resultSet);
		}
	}
	
	/**
	 * 关闭数据库
	 * 
	 * author 李岚祺
	 */
	private void close(Connection connection,Statement statement,ResultSet resultSet) {
		if(resultSet!=null) {
			try {
				resultSet.close();
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
