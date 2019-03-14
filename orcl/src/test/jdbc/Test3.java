package test.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import jdbc.test.DBLink;
import jdbc.test.IRowMapper;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner in =  new Scanner(System.in);
		System.out.println("请输入身份证号");
		String id_card = in.next();
		String sql = "select * from user_information where id_card = ?";
		
		class RowMapper implements IRowMapper{
			@Override
			public void RowMapper(ResultSet rs) {
				try {
					if(rs.next()) {
						String birth = id_card.substring(6, 14);
						LocalDate date = LocalDate.now();
						int year = date.getYear();
						int month = date.getMonthValue();
						int today = date.getDayOfMonth();
						int age = (year*365+month*30+today-Integer.parseInt(birth.substring(0,4))*365-Integer.parseInt(birth.substring(4,6))*30-Integer.parseInt(birth.substring(6,8)))/365;
						String last = id_card.substring(17,18);
						if((Integer.parseInt(last)&1)!=0) {
							System.out.println("性别女");
						}else {
							System.out.println("性别男");
						}
						System.out.println("年龄为"+age);
					}else {
						System.out.println("查无此人");
					}
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
		new DBLink().select(sql, new RowMapper(), id_card);
	}
}
