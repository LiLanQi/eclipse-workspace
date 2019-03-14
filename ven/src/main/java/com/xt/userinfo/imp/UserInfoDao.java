package com.xt.userinfo.imp;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.xt.userinfo.IUserInfoDao;
import com.xt.util.db.DBLink;
import com.xt.util.db.IRowMapper;

/**
 * 用户数据访问接口实现类
 * 
 * @author 李岚祺
 */
public class UserInfoDao implements IUserInfoDao {

	/**
	 * 实现依据用户名和密码登陆抽象方法
	 * 
	 * @author 李岚祺
	 */
	public boolean login(String username, String password) {
		
		class RowMapper implements IRowMapper<Boolean>{
			
			public Boolean RowMapper(ResultSet rs) {
				try {
					return rs.next();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return false;
			}
		}
		
		String sql = "select * from register where id=? and password=?";
		
		RowMapper rowMapper = new RowMapper();
		return new DBLink<Boolean>().select(sql, rowMapper, username,password);
	}

	/**
	 * 实现依据用户名和密码注册抽象方法
	 * 
	 * @author 李岚祺
	 */
	public boolean register(String username, String password) {
		String sql = "insert into register values(?,?)";
		return new DBLink().update(sql, username,password);
	}
}