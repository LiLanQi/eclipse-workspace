import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	
	@Before
	public void addInit() {
		System.out.println("测试初始化");
	}
	
	@After
	public void addClose() {
		System.out.println("测试结束");
	}
	
	@Test(expected  =  ArithmeticException. class)
	public void add1() {
		System.out.println("add1");
	}
	
	@Test(timeout = 1000)
	public void add2() {
		System.out.println("add2");
	}
	
	@BeforeClass
	public static void init() {
		System.out.println("测试开始");
	}
	
	@AfterClass
	public static void close() {
		System.out.println("测试真正结束");
	}

	
	public void add() {
		Connection connection = DBUtil.getConnection();
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from student");
			while(resultSet.next()) {
				System.out.println(resultSet.getString("stuName") + " " +resultSet.getString("score") + " " + resultSet.getInt("age"));
				System.out.println("测试成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(connection, statement, resultSet);
		}
	}
}
