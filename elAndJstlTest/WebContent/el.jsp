<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	${1+1};
	${requestScope.msg};
	${sessionScope.msg};
	${msg};
	${3 > 4 ? "yes":"no"};
	${3 == 5};
	${empty pageScope.msg};
	<br>
	${header.host }
	<br>
	${pageContext.request.servletPath};
	<br>
	${pageContext.session.id }
	<br>
	${student.stuName } + ${1 };
	<br>
	${pageContext.request.method } + ${pageContext.request}
	<br>
	${header["accept-language"]};
</body>
</html>