

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.SMSUtils;

public class CheckcodeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");//用户输入的验证码
		String mobile = request.getParameter("mobile");
		System.out.println(code);
		if(SMSUtils.verifyCode(mobile,code)) {
			System.out.println("成功");
			//验证成功跳转到成功界面
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else {
			System.out.println("失败");
		}
	}

}
