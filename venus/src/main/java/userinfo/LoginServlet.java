package userinfo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import userinfo.imp.UserInfoService;

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	IUserInfoService userInfoService = new UserInfoService();   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("user_name");
		String password = request.getParameter("password");
		System.out.println(userName+":"+password);
		if(userInfoService.login(userName, password)) {
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else {
			System.out.println("失败");
		}
	}
}