<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript" src = "static/js/jquery-3.3.1.js"></script>
	</head>
	<script type="text/javascript">
		$(function(){
			$("button").click(function(){
				$.ajax({
					type:"post",
					data:{userName:"小强", password:"123456"},
					url:"jqueryAjaxGetData.do",
					dataType:"json",
					success:function(date){
						$.each(date, function(){
							$("div").append("<span>错误代码：" + this.code + "</span> <span>错误信息" + this.msg + "</span>");
						});
					}
				});
			});
		});
	</script>
	<body>
		<button>按钮</button>
		<div></div>
	</body>
</html>