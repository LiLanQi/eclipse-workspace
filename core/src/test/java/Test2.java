import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xt.util.db.DBLink;
import com.xt.util.db.IRowMapper;

public class Test2 {

	public static void main(String[] args) {
		List<UserInfo> list = new ArrayList<>();
		String sql = "select * from register";
		new DBLink<List<UserInfo>>().select(sql, new IRowMapper<List<UserInfo>>() {
			@Override
			public List RowMapper(ResultSet rs) {
				try {
					while(rs.next()) {
						UserInfo userInfo = new UserInfo();
						userInfo.setId(rs.getString("id"));
						userInfo.setPassword(rs.getString("password"));
						list.add(userInfo);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return null;
			}
		});
		for (UserInfo userInfo : list) {
			System.out.println(userInfo.getId()+":"+userInfo.getPassword());
		}
	}
}
