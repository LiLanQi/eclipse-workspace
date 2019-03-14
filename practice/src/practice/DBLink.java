package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBLink<E> {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		String sql = "jdbc:oracle:thin:@192.168.7.14:1521:orcl";
		try {
			return DriverManager.getConnection(sql,"scott","root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean batchUpdate(String...sql) {
		Connection connection = getConnection();
		Statement statement = null;
		try {
			connection.setAutoCommit(false);
			statement = connection.createStatement();
			for (String string : sql) {
				statement.executeUpdate(string);
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
	
	public boolean update(String sql) {
		Connection connection = getConnection();
		Statement statement = null;
		try {
			statement = connection.createStatement();
			return statement.executeUpdate(sql)>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(connection,statement,null);
		}
		return false;
	}
	
	public boolean update(String sql,Object...values) {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement =	connection.prepareStatement(sql);
			for(int i=1;i<=values.length;i++) {
				preparedStatement.setObject(i,values[i-1]);
			}
			return preparedStatement.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(connection,preparedStatement,null);
		}
		return false;
	}
	
	public E select(String sql,IRowMapper<E> rowMapper) {
		Connection connection = getConnection();
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			return rowMapper.rowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(connection,statement,rs);
		}
		return null;
	}
	
	public E select(String sql,IRowMapper<E> rowMapper,Object...values) {
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			for(int i=1;i<=values.length;i++) {
				preparedStatement.setObject(i, values[i-1]);
			}
			rs =  preparedStatement.executeQuery();
			return (rowMapper.rowMapper(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(connection,preparedStatement,rs);
		}
		return null;
	}
	
	public void close(Connection connection,Statement statement,ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(statement!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(connection!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
