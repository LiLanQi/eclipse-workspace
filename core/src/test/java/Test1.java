import java.sql.ResultSet;
import java.sql.SQLException;

import com.xt.util.db.DBLink;
import com.xt.util.db.IRowMapper;

public class Test1 {

	public static void main(String[] args) {
		String sql = "select * from register where id = ? and password = ?";
		System.out.println(new DBLink<String>().select(sql,(ResultSet rs)->{
			String id = null;
				try {
					if(rs.next()) {
						id = rs.getString("id");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return id;
		}, "111","111"));
	}
}
