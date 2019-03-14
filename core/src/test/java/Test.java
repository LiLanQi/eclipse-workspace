import java.sql.ResultSet;
import java.sql.SQLException;
import com.xt.util.db.DBLink;
import com.xt.util.db.IRowMapper;

public class Test {

	public static void main(String[] args) {
		
		class RowMapper implements IRowMapper<String>{
			String id = null;
			@Override
			public String RowMapper(ResultSet rs) {
				try {
					if(rs.next()) {
						id = rs.getString("id");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return id;
			}
		}
		RowMapper rowMapper = new RowMapper();
		System.out.println(new DBLink<String>().select("select * from register where id = ? and password = ?", rowMapper, "111","111"));
	}
}
