package jspTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StuDao {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(String stuNo) {
		Connection connection = null;
		Statement statement = null;
		String sql = "delete from student where stuNo = '"+stuNo+"'";
		try {
			connection = DriverManager.getConnection(PropertiesUtil.getValue("url"), PropertiesUtil.getValue("user_name"), PropertiesUtil.getValue("password"));
			statement = connection.createStatement();
			if(statement.executeUpdate(sql) > 0) {
				System.out.println("数据删除成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public List<Student> getAllStus(Student student) {
		List<Student> stuList = new ArrayList<Student>();
		Student stu = null;
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = "select * from student where 1 = 1";
		if(student.getStuName() != null && !"".equals(student.getStuName())) {
			sql += " and stuName = '"+ student.getStuName() +"'";
		}
		if(student.getStuNo() != null && !"".equals(student.getStuNo())) {
			sql += " and stuNo = '"+ student.getStuNo() +"'";
		}
		
		try {
			connection = DriverManager.getConnection(PropertiesUtil.getValue("url"), PropertiesUtil.getValue("user_name"), PropertiesUtil.getValue("password"));
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				stu = new Student();
				stu.setStuName(resultSet.getString(2));
				stu.setAge(resultSet.getInt(4));
				stu.setGender(resultSet.getInt(3));
				stu.setScore(resultSet.getInt(5));
				stu.setStuNo(resultSet.getString(1));
				stuList.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return stuList;
	}
	
	public void insert(Student stu) {
		Connection connection = null;
		Statement statement = null;
		String sql = "insert into student values ('" + stu.getStuNo() + "', '" + stu.getStuName() + "', " + stu.getGender() + ", " + stu.getAge()+ ", " + stu.getScore() +  ")";
		try {
			connection = DriverManager.getConnection(PropertiesUtil.getValue("url"), PropertiesUtil.getValue("user_name"), PropertiesUtil.getValue("password"));
			statement = connection.createStatement();
			if(statement.executeUpdate(sql) > 0) {
				System.out.println("数据修改成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
