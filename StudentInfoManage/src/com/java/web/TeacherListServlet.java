package com.java.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.TeacherDao;
import com.java.model.Teacher;
import com.java.model.PageBean;
import com.java.util.DbUtil;
import com.java.util.JsonUtil;
import com.java.util.ResponseUtil;
import com.mysql.jdbc.Connection;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TeacherListServlet extends HttpServlet {

	DbUtil dbUtil=new DbUtil();
	TeacherDao teacherDao=new TeacherDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page=req.getParameter("page");
		String rows=req.getParameter("rows");
		Teacher teacher=new Teacher();
		String tname=req.getParameter("tname");
		if(tname==null){
			tname="";
		}
		teacher.setTname(tname);
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Connection con=null;
		
		try{
			con=dbUtil.getCon();
			JSONObject result=new JSONObject();
			JSONArray jsonArray=JsonUtil.formatRsToJsonArray(teacherDao.gradeList(con, pageBean, teacher));
			int total=teacherDao.gradeCount(con, teacher);
			result.put("rows", jsonArray);
			result.put("total", total);
			ResponseUtil.write(resp, result);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
