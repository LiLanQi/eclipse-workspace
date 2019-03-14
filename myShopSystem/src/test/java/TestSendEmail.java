import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import org.junit.Test;

/**
 * 邮箱验证测试类
 * 
 * @author 李岚祺
 *
 */
public class TestSendEmail {
	@Test
	public static void main(String[] args) throws Exception {       

		  Properties properties = new Properties();
		  properties.put("mail.transport.protocol", "smtp");// 连接协议        
		  properties.put("mail.smtp.host", "smtp.qq.com");// 主机名        
		  properties.put("mail.smtp.port", 465);// 端口号        
		  properties.put("mail.smtp.auth", "true");        
		  properties.put("mail.smtp.ssl.enable", "true");//设置是否使用ssl安全连接  ---一般都使用        
		  properties.put("mail.debug", "true");//设置是否显示debug信息  true 会在控制台显示相关信息        

		// 根据配置创建会话对象, 用于和邮件服务器交互     
		Session session = Session.getInstance(properties);        

		// 获取邮件对象        
		Message message = new MimeMessage(session);        

		//设置发件人邮箱地址       
		message.setFrom(new InternetAddress("lanqili@lilanqi.com"));   
		
		//设置收件人邮箱地址
		message.setRecipients(RecipientType.TO, new InternetAddress[] { new InternetAddress("1042520531@qq.com") });       

		//设置邮件标题        
		message.setSubject("账号激活");        

		//设置邮件内容        
		message.setContent("<a href=http://localhost/ShopSystem/>尊敬的 用户,您好!!欢迎您使用我们的电子商务网站!!" +  
                "  请点击激活您的账户</a>","text/html;charset=UTF-8");       

		 //得到邮件传输对象        
		Transport transport = session.getTransport();        

		//连接自己的邮箱账户        
		transport.connect("lanqili@lilanqi.com", "uaznpwgjgmjcbeji");//密码为刚才得到的授权码     
		
		//发送
		transport.sendMessage(message, message.getAllRecipients());    
		}
}
