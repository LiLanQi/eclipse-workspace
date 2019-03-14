package com.xt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xt.common.MessageTable;
import com.xt.dao.CommentDao;


@WebServlet("*.comment")
public class CommentServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		
		
		if("/getCommentByUserId.comment".equals(path)) {
			List<MessageTable> commentList = new CommentDao().findCommentByUserId("1");
			
			System.out.println(commentList);
			request.setAttribute("commentList", commentList);
			request.getRequestDispatcher("comment.jsp").forward(request, response);
			
		}
		
		
	}
	
	
	

}
