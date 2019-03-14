package com.java.web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.java.dao.GradeDao;
import com.java.dao.TeacherDao;
import com.java.model.Grade;
import com.java.model.PageBean;
import com.java.model.Teacher;
import com.java.util.DbUtil;
import com.java.util.JsonUtil;
import com.java.util.ResponseUtil;
import com.java.util.StringUtil;

public class TeacherSaveServlet extends HttpServlet{
	DbUtil dbUtil=new DbUtil();
	TeacherDao teacherdao=new TeacherDao();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String tname=request.getParameter("tname");
		String colleage=request.getParameter("colleage");
		String course=request.getParameter("course");
		String sex=request.getParameter("sex");
		String tdate=request.getParameter("tdate");
		String tnum=request.getParameter("tnum");
		Teacher teacher=new Teacher(tname,colleage,course,sex,tdate);
		if(StringUtil.isNotEmpty(tnum)){
			teacher.setTnum(Integer.parseInt(tnum));
		}
		Connection con=null;
		try{
			con=dbUtil.getCon();
			int saveNums=0;
			JSONObject result=new JSONObject();
			if(StringUtil.isNotEmpty(tnum)){
				saveNums=teacherdao.gradeModify(con, teacher);
			}else{
				saveNums=teacherdao.gradeAdd(con, teacher);
			}
			if(saveNums>0){
				result.put("success", "true");
			}else{
				result.put("success", "true");
				result.put("errorMsg", "错误");
			}
			ResponseUtil.write(response, result);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				dbUtil.closeCon(con);
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	
}
