package com.xt.userinfo.imp;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.xt.userinfo.IUserInfoDao;
import com.xt.userinfo.IUserInfoService;
import com.xt.util.db.DBLink;
import com.xt.util.db.IRowMapper;

public class UserInfoDao implements IUserInfoDao{

	@Override
	public boolean login(String userName, String password) {
		
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
		new DBLink().select("select id from register where id = ? and password = ?",rowMapper, userName,password);
		return rowMapper.flag;
	}
}