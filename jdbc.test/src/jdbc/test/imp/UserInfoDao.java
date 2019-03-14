package jdbc.test.imp;

import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.test.DBLink;
import jdbc.test.IRowMapper;

public class UserInfoDao implements IUserInfoDao{

	
	@Override
	public boolean login(String userName, String password) {
		
		class RowMapper implements IRowMapper{
			
			boolean flag;
			
			@Override
			public void  RowMapper(ResultSet rs) {
				try {
					flag = rs.next();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		RowMapper rowMapper = new RowMapper();
		new DBLink().select("select * from register where id = ? and password = ?", rowMapper, userName,password);
		return rowMapper.flag;
	}
}
