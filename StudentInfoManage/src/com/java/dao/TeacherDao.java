package com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java.model.Grade;
import com.java.model.PageBean;
import com.java.model.Teacher;
import com.java.util.StringUtil;

public class TeacherDao {
	public ResultSet gradeList(Connection con,PageBean pageBean,Teacher teacher)throws Exception{
		StringBuffer sb=new StringBuffer("select * from t_teacher");
		if(StringUtil.isNotEmpty(teacher.getTname())){
			sb.append(" and tname like '%"+teacher.getTname()+"%'");
		}
		if(pageBean!=null){
			sb.append(" limit "+pageBean.getStart()+","+pageBean.getRows());
		}
		PreparedStatement pstmt=con.prepareStatement(sb.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
	}
	
	public int gradeCount(Connection con,Teacher teacher)throws Exception{
		StringBuffer sb=new StringBuffer("select count(*) as total from t_teacher");
		if(StringUtil.isNotEmpty(teacher.getTname())){
			sb.append(" and tname like '%"+teacher.getTname()+"%'");
		}
		PreparedStatement pstmt=con.prepareStatement(sb.toString().replaceFirst("and", "where"));
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			return rs.getInt("total");
		}else{
			return 0;
		}
	}
	/**
	 * delete from tableName where field in (1,3,5)
	 * @param con
	 * @param delIds
	 * @return
	 * @throws Exception
	 */
	public int gradeDelete(Connection con,String delIds)throws Exception{
		String sql="delete from t_teacher where id in("+delIds+")";
		PreparedStatement pstmt=con.prepareStatement(sql);
		return pstmt.executeUpdate();
	}
	
	public int gradeAdd(Connection con,Teacher teacher)throws Exception{
		String sql="insert into t_teacher values(null,?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		pstmt.setString(1, teacher.getTname());
		pstmt.setString(2, teacher.getColleage());
		pstmt.setString(3, teacher.getCourse());
		pstmt.setString(4, teacher.getSex());
		pstmt.setString(5, teacher.getTdate());
		return pstmt.executeUpdate();
	}
	public int gradeModify(Connection con,Teacher teacher)throws Exception{
		String sql="update t_teacher set tname=?,colleage=?,course=?,sex=?,tdate=? where tnum=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, teacher.getTname());
		pstmt.setString(2, teacher.getColleage());
		pstmt.setString(3, teacher.getCourse());
		pstmt.setString(4, teacher.getSex());
		pstmt.setString(5, teacher.getTdate());
		pstmt.setInt(6, teacher.getTnum());
		return pstmt.executeUpdate();
	}
}
