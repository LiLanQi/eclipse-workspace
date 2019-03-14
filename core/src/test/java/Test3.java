import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xt.util.db.DBLink;
import com.xt.util.db.IRowMapper;

public class Test3 {

	public static void main(String[] args) {
		String sql = "select * from register";
		List <UserInfo> list = new ArrayList<>();
		new DBLink<List<UserInfo> >().select(sql, new IRowMapper<List<UserInfo> >(){

			@Override
			public List<UserInfo> RowMapper(ResultSet resultSet) {
				try {
					while(resultSet.next()) {
						UserInfo userInfo = new UserInfo();
						userInfo.setId(resultSet.getString("id"));
						userInfo.setPassword(resultSet.getString("password"));
						list.add(userInfo);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return null;
			}
		
		});
		for (UserInfo userInfo : list) {
			System.out.println(userInfo.getId()+" "+userInfo.getPassword());
		}
	}
}
