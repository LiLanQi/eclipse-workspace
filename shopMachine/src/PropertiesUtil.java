
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesUtil {

	static Properties properties;
	static {
		properties = new Properties();
		InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream("db.properties");
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}catch(NullPointerException e) {
			try {
				throw new NotFoundPropertiesException("src中没有找到properties文件");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public static String getValue(String key) {
		return properties.getProperty(key);
	}
	
	public static void main(String[] args) {
		System.out.println(getValue("url"));
	}
}
