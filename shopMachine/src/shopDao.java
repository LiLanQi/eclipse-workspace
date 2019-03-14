import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class shopDao {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/*private QueryRunner queryRunner;
	
	@Before
	public void init() {
		queryRunner = new QueryRunner(DBUtil.getDruidDataSource());
	}
	*/
	@Test
	public Goods add(Goods goods) {
		Goods newgoods = null;
		String sql = "select * from goods where goods_id = '"+goods.getGoodsId()+"'";
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		System.out.println(sql);
		try {
			connection = DriverManager.getConnection(PropertiesUtil.getValue("url"), PropertiesUtil.getValue("user_name"), PropertiesUtil.getValue("password"));
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				System.out.println(resultSet.getString(2));
				newgoods = new Goods(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3), 0);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return newgoods;
	}
}
	
	/*@Test
	public void queryTest() {
		String sql = "select * from goods";
		try {
			List<Goods> list = (List<Goods>) queryRunner.query(sql, new BeanListHandler(Goods.class));
			for (Goods goods : list) {
				System.out.println(goods);
			}
			System.out.println("查询成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/
	
