package com.xt.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.xt.common.User;
import com.xt.dao.IUserInfoDao;
import com.xt.util.DBUtil;
import com.xt.util.SMSUtils;

/**
 * 用户数据访问接口实现类
 * 
 * @author 李岚祺
 */
public class UserInfoDaoImpl implements IUserInfoDao{

	private QueryRunner qr = new QueryRunner(DBUtil.getDruidDataSource());
	
	/**
	 * 实现依据用户名和密码登陆抽象方法
	 * 
	 * @author 李岚祺
	 */
	@Override
	public List<User> loginById(String userName, String password) {
		String sql = "select * from user_info where id = '"+userName+"' and password = '"+password+"'";
		try {
			return qr.query(sql, new BeanListHandler<User>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<User> loginByEmail(String userName, String password) {
		String sql = "select * from user_info where email = '"+userName+"' and password = '"+password+"'";
		try {
			return qr.query(sql, new BeanListHandler<User>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> loginByMobile(String userName, String password) {
		String sql = "select * from user_info where phone = '"+userName+"' and password = '"+password+"'";
		try {
			return qr.query(sql, new BeanListHandler<User>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;	}
	

	/**
	 * 实现依据用户名和密码和手机号注册抽象方法
	 * 
	 * @author 李岚祺
	 */
	@Override
	public boolean registerByPhone(String password, String phone, String code) {
		try {
			if(SMSUtils.verifyCode(phone, code)) {
				String sql = "insert into user_info(phone, password) values('"+phone+"', '"+password+"')";
				int result;
				try {
					result = qr.update(sql);
					if (result > 0) {
						return true;
					} else {
						return false;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 实现依据密码和邮箱注册抽象方法
	 * 
	 * @author 李岚祺
	 */
	@Override
	public boolean registerByEmail(String password, String email) {
		String sql = "insert into user_info(email, password) values('"+email+"', '"+password+"')";
		int result;
		try {
			result = qr.update(sql);
			if (result > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void updateUserInformation(String id, String tempName, String realName, int sex, Timestamp date, String email,
			String phone) {
		String sql = "update user_info set name='"+realName+"', sex="+sex+", date='"+date+"', email='"+email+"', phone='"+phone+"', tempname='"+tempName+"'  where id = '"+id+"'";
		System.out.println(sql);
		try {
			qr.update(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updataAddressInformation(String id, String name, String phone, String address, String detailAddress,int user_info_id) {
		String sql = "insert into user_info_address values('"+id+"', '"+name+"', '"+phone+"', '"+address+"', '"+detailAddress+"', "+user_info_id+")";
		System.out.println(sql);
		try {
			qr.update(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
