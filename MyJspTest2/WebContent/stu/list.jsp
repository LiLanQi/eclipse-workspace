<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="com.lilanqi.test.Student" %>

<%
	/* Student student = (Student)request.getAttribute("Student");
	List<Student> list = (List<Student>)request.getAttribute("list"); */
	//上面的方法不可取，会爆发异常，理由是强制类型转换的时候出错，按下面的方式来就不会出错，查询能正常进行
	Object o = request.getAttribute("list");
	Object obj = request.getAttribute("student");
	Student student = null;
	List<Student> list = null;
	if(o != null) {
		list = (List<Student>) o;
	}
	if(obj != null) {
		student = (Student) obj;
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<title>Insert title here</title>
		</head>
	<body>
		<div align = "center" >
			<h3>学生信息管理</h3>
			<hr>
			<table>
				<form action="stuServlet?method=query" method = "post">
					<tr>
						<td colspan="2" align="left">学号 <input type = "text" name = "stuNo" value=<%=student.getStuNo()==null?"":student.getStuNo() %>></td>
						<td colspan="2" align="right">姓名 <input type = "text" name = "stuName" value=<%=student.getStuName()==null?"":student.getStuName() %>></td>
					</tr>
					<tr>
						<td colspan="2" align = "left"><input type = "submit" value = "查询"></td>
						<td colspan="2" align = "right"><input type = "reset" value = "重置"></td>
					</tr>
				</form>
				<tr >
					<th>学号</th><th>姓名</th><th>性别</th><th>年龄</th><th>分数</th><th>操作</th>
				</tr>
				<%
					for(Student s : list) {
				%>
				<tr>
					<td><%=s.getStuNo() %></td><td><%=s.getStuName() %></td><td><%=s.getGender() %></td><td><%=s.getAge() %></td><td><%=s.getScore() %></td><td><a href = "stuServlet?method=delete&stuNo=<%=s.getStuNo()%>">删除</a></td>
				</tr>
				<%
					}
				%>
			</table>
		</div>
	</body>
</html>