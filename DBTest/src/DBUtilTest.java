import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Before;
import org.junit.Test;

public class DBUtilTest {

	private QueryRunner queryRunner;
	
	@Before
	public void init() {
		queryRunner = new QueryRunner(DBUtil.getDruidDataSource());
	}
	
	public void dbTest() {
		try {
			System.out.println(queryRunner);
			queryRunner.update("update student set stuName = ? where stuName = ?","岚祺李","王二百");
			System.out.println("修改成功12");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void queryTest() {
		String sql = "select * from student";
		try {
			List<Student> list = (List<Student>) queryRunner.query(sql, new BeanListHandler(Student.class));
			for (Student student : list) {
				System.out.println(student);
			}
			System.out.println("查询成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
