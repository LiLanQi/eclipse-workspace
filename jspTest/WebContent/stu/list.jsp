<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="jspTest.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	Object o = request.getAttribute("stuList");
	Object obj = request.getAttribute("Student");
	Student student = null;
	List<Student> stuList = null;
	if(o != null) {
		stuList = (List<Student>) o;
	}
	if(obj != null) {
		student = (Student) obj;
	}
%>
<body>
	<div align="center">
		<h3>学生信息</h3>
		<hr>
		<form action="stulist" method = "post">
			<table>
				<tr>
					<td colspan="2" align="left">学号 <input type = "text" name = "StuNo" value=<%=student.getStuNo()==null?"":student.getStuNo() %>></td>
					<td colspan="2" align="right">姓名 <input type = "text" name = "StuName" value=<%=student.getStuName()==null?"":student.getStuName() %>></td>
				</tr>
				<tr>
					<td colspan="2" align = "left"><input type = "submit" value = "查询"></td>
					<td colspan="2" align = "right"><input type = "reset" value = "重置"></td>
				</tr>
			</table>
		</form>
		</br>
		<table border = "1px" cellspacing="0px" width = "90%">
			<tr>
				<th>学生编号</th><th>学生姓名</th><th>性别</th><th>年龄</th><th>成绩</th><th>操作</th>
			</tr>
			<% 
				for(Student stu: stuList){
			%>
			<tr>
				<td><%=stu.getStuNo()%></td><td><%=stu.getStuName()%></td><td><%=stu.getGender()%></td>
				<td><%=stu.getAge()%></td><td><%=stu.getScore()%></td><td> <a href="delStu?stuNo=<%=stu.getStuNo()%>">删除</a> 修改 </td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>