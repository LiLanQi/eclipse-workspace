



	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="message.MessageData" %>
<%@ page import="java.util.*"%>
<jsp:useBean id="myBean" class="message.MessageBean" scope="page"/>
<HTML><HEAD><TITLE> show the message in the table </TITLE></HEAD>
<BODY><p align="center">所有留言</p>
 <TABLE  align="center" width="80%" border=1 bottom:5 >
 <%    
   int message_count=0;
   Collection <MessageData> messages=myBean.getAllMessage();
   Iterator <MessageData> it=messages.iterator();
   while(it.hasNext()){ MessageData mg=(MessageData)it.next();   
 %>
   <tr>
		<td width="20%">留言人:</td>
		<td width="23%" ><font color="red"><%=mg.getName()%></font></td>
		<td width="58%" align="center" style="color:red;"><% out.println(
	"<a href=mailto:"+mg.getEmail()+">"+mg.getEmail()+"</a>");
%></td></tr>
	<tr>
		<td width="20%">主题:</td>
		<td colspan="3"><%=mg.getTitle()%></td>
	</tr>
	<tr>
		<td width="20%">内容:</td>
		<td colspan="3"><%=mg.getContent()%></td>
	</tr>
	<tr>
		<td width="20%">.</td>
		<td colspan="3">.</td>
	</tr>
   <%  message_count++;
  } 
   %>
 </Table>
 
<p align="center"><a href="studentInfoManage.jsp">我要留言</a></p>
</body></html>
