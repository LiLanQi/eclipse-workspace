package com.java.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.GradeDao;
import com.java.dao.TeacherDao;
import com.java.util.DbUtil;
import com.java.util.ResponseUtil;
import com.mysql.jdbc.Connection;

import net.sf.json.JSONObject;

public class TeacherDeleteServlet extends HttpServlet{
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
		String delIds=request.getParameter("delIds");
		Connection con=null;
		try{
			System.out.println("可以显示SSS");
			con=dbUtil.getCon();
			JSONObject result=new JSONObject();
			int delNums=teacherdao.gradeDelete(con, delIds);
			if(delNums>0){
				result.put("success", "true");
				result.put("delNums", delNums);
			}else{
				result.put("errorMsg", "删除失败");
			}
			ResponseUtil.write(response, result);
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