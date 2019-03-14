<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.List" %>
<%@ page import = "com.lilanqi.user.User" %>

<%
	User user = null;
	List<User> list = null;
	Object o = request.getAttribute("user");
	if(o != null) {
		user = (User) o;
	}
	Object obj = request.getAttribute("list");
	if(obj != null) {
		list = (List<User>) obj;
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div>
			<table>
				<form action = "userServlet?method=search" method = "post">
					<tr>
						<th>用户ID</th><th><input name = "userId" value = "<%=user.getUserId() == 0 ? "" : user.getUserId() %>"></th>
						<th>登陆账号</th><th><input name = "loginName" value = "<%=user.getLoginName() == null ? "" : user.getLoginName()%>"></th>
						<th><input type = "submit" value = "查询"></th>
					</tr>
				</form>
				<tr><th>用户ID</th><th>登陆账号</th><th>用户昵称</th><th>用户类型</th><th>用户邮箱</th><th>手机号码</th><th>用户性别</th><th>密码</th><th>账号状态</th><th>删除状态</th><th>备注</th><th>操作</th></tr>
				<%
					for(User u:list){
				%>
					<tr>
						<th><%=u.getUserId()%></th>
						<th><%=u.getLoginName()%></th>
						<th><%=u.getUserName()%></th>
						<th><%=u.getUserType()%></th>
						<th><%=u.getEmail()%></th>
						<th><%=u.getPhonenumber()%></th>
						<th><%=u.getSex()%></th>
						<th><%=u.getPassword()%></th>
						<th><%=u.getStatus()%></th>
						<th><%=u.getDelFlag()%></th>
						<th><%=u.getRemark()%></th>
						<th><a href = "userServlet?method=delete&userId=<%=u.getUserId()%>">删除</a></th>
						<th><a href="user/change.jsp?&userId=<%=u.getUserId()%>">修改</a></th>
					</tr>
				<%
					}
				%>
				
			</table>
		</div>
	</body>
</html>