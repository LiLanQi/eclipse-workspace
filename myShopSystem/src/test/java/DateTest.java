

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
	public static void main(String[] args) {
		
		String str = "1999-12-11";
		DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = fmt.parse(str);
			System.out.println(date);
			Timestamp timeStamep = new Timestamp(date.getTime());
			System.out.println(timeStamep);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
