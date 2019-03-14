package message;


import java.sql.*;   //引入java.sql包
import java.util.*;
public class  MessageBean {
	private Connection con; 	MessageData msg;
	public MessageBean()
	{  String JDriver="com.mysql.jdbc.Driver"; //定义驱动程序对象 
	 String userName="root"; //定义数据库用户名  
	 String userPasswd="root"; //定义数据库存取密码  
	 String dbName="message"; //定义数据库名  
	 String conURL="jdbc:mysql://localhost:3306/mygoods";
	 try{Class.forName(JDriver).newInstance(); //加载JDBC驱动程序
   con=DriverManager.getConnection(conURL,userName,userPasswd); 
	//连接数据库
	    }
	catch(Exception e){System.err.println(e.getMessage());}
	}
   public  void  setMessage(MessageData msg) {this.msg=msg;}
   //	添加一条留言消息
	public void addMessage()throws Exception
	{  try{ byte b1[]=msg.getTitle().getBytes("ISO-8859-1");
			String ti=new String(b1);
			byte b2[]=msg.getName().getBytes("ISO-8859-1");
			String na=new String(b2);
			byte b3[]=msg.getEmail().getBytes("ISO-8859-1");
			String em=new String(b3);
			byte b4[]=msg.getContent().getBytes("ISO-8859-1");
			String c=new String(b4);
			PreparedStatement stm=con.prepareStatement(
	"insert into messagetable values(?,?,?,?)");
			stm.setString(1,ti);  stm.setString(2,na);
		   if((msg.getEmail()).length()==0)stm.setString(3,"");
		   else stm.setString(3,em);	
		   stm.setString(4,c);
		   try	{stm.execute();   stm.close();	} 
		   catch(Exception e) { }			
		   con.close();  //关闭数据库连接
		}
	   catch(Exception e){	e.printStackTrace(); throw e;}
	}
   //	获得所有留言消息，并返回结果到JSP页面
  public Collection<MessageData> getAllMessage()throws Exception
	{ Collection<MessageData> ret=new ArrayList<MessageData>();
	try{ Statement stm=con.createStatement();
		 ResultSet result=stm.executeQuery(
	"select count(*) from messagetable");		
		int message_count=0;
		if(result.next()){	message_count=result.getInt(1);
				result.close();	}
		if(message_count>0)
		{ result=stm.executeQuery("select * from messagetable ");
	  while(result.next())
	{ String title=result.getString("title");
		  String name=result.getString("name");
		  String email=result.getString("email");
		  String content=result.getString("content");
		  MessageData message=new MessageData();
		  message.setTitle(title); message.setName(name);
	message.setEmail(email); message.setContent(content);
	ret.add(message);						
		}
		result.close(); 	stm.close();
	  }			
	con.close();		
	}
	catch(Exception e)
	 { e.printStackTrace();	throw e; }
	return ret;
	}
}
