package com.xt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xt.common.MessageTable;
import com.xt.util.DBUtil;

public class CommentDao {

	
	public List<MessageTable> findCommentByUserId(String userId){
		List<MessageTable> messageTableList = new ArrayList<>();
		
		Connection con = DBUtil.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from messageTable where email = ?");
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				MessageTable messageTable = new MessageTable();
				
				String title =rs.getString(1);
				String name =rs.getString(2);
				String email =rs.getString(3);
				String content =rs.getString(4);
				messageTable.setContent(content);
				messageTable.setEmail(email);
				messageTable.setName(name);
				messageTable.setTitle(title);
				messageTableList.add(messageTable);
				
			}
			return messageTableList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return messageTableList;
	}
}
