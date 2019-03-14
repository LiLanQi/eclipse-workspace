



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="Mdata" class="message.MessageData" scope="page">
	<jsp:setProperty name="Mdata" property="*"/></jsp:useBean>
<jsp:useBean id="myBean" class="message.MessageBean" scope="page"/>
<HTML><HEAD><TITLE> message into table </TITLE></HEAD>
<BODY>
<% try {  myBean.setMessage(Mdata);   myBean.addMessage(); }
   catch(Exception e) { e.printStackTrace();}
%>
<jsp:forward page="viewMessages.jsp" />
</body></html>
