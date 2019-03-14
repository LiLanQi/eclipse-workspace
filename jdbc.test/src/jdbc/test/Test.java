package jdbc.test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		String sql = "select * from register where id = ? and password = ?";
		class RowMapper implements IRowMapper{
			
			boolean flag;
			
			@Override
			public void RowMapper(ResultSet rs) {
				try {
					flag = rs.next();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		RowMapper rowMapper = new RowMapper();
		new DBLink().select(sql, rowMapper, "111","111");
		System.out.println(rowMapper.flag);
	}
}