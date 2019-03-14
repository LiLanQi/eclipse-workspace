<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML><HEAD> <TITLE> message board </TITLE></HEAD>
<BODY> <center>商品评价区</center>
<FORM action="addMessage.jsp" >
 <TABLE  border=1 align="center">
 <TR><TD>姓名：</TD><TD><input type="text" name="name" size=25>
	</TD></TR>
 <TR><TD>E-mail：</TD>
	<TD><input type="text" name="email" size=25></TD></TR>
 <TR><TD>购买物品：</TD>
	<TD><input type="text" name="title" size=25></TD></TR>
   <TR><TD>评价：</TD>
	<TD><textarea name="content" rows=7 cols=25></textarea>
	</TD></TR>
   <TR><TD colspan=3>
<TABLE align="center" width="100%" cellspacing="0" cellpadding="0" >
   <TR>
	 <TD align="center"><input type="submit" value="提交留言"></TD>
   <TD align="center">
	<a href="viewMessages.jsp"><font size=2>查看留言</font></a></TD>
   <TD align="center"><input type="reset" value="重新填写"></TD>
   </TR></TABLE></TD>  </TR></TABLE></FORM></BODY></HTML>
 
