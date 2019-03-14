package practice;

import java.sql.ResultSet;

public interface IRowMapper<E> {
	
	E rowMapper(ResultSet rs);
}
