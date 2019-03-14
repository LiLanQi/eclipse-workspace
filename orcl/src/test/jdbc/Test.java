package test.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import jdbc.test.DBLink;
import jdbc.test.IRowMapper;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入账号");
		String id = scanner.nextLine();
		System.out.println("请输入密码");
		String password = scanner.nextLine();
		String sql = "select * from register where id = ? and password = ?";
		new DBLink().select(sql,(ResultSet rs)-> {
				try {
					if(!rs.next()) {
						System.out.println("该用户可以注册,注册成功");
						boolean a = new DBLink().update("insert into register values(?,?)",id,password);
					}else {
						System.out.println("注册失败");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}, id,password);
	}
}
