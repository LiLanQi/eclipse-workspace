package java4jTest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;

@WebServlet("/my")
public class log4jTest extends HttpServlet{

	private final Log log = LogFactory.getLog(log4jTest.class);
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.debug("开始访问数据库");
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		String sql = "select * from student";
		log.info("加载驱动程序");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			log.error("找不到驱动类",e);
		}
		log.info("通过驱动管理器获取数据库连接");
		try {
			conn = DriverManager.getConnection(PropertiesUtil.getValue("url"), PropertiesUtil.getValue("user_name"), PropertiesUtil.getValue("password"));
			log.info("创建statement对象");
			stat = conn.createStatement();
			log.info("执行sql查询");
			rs = stat.executeQuery(sql);
			if (rs.next()) {
				log.info("查询结果："+"asdasdasd");
			}
		} catch (SQLException e) {
			log.error("数据库处理异常", e);
		}
		resp.sendRedirect("index.jsp");
	}
}
