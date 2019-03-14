import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.SMSUtils;

public class SendcodeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static String templateId = "4003516";
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mobile = request.getParameter("mobile");
		System.out.println(mobile);
		SMSUtils.sendCode(mobile, templateId);
	}
}
