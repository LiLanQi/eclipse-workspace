package util;

import java.util.Properties;

/**
 * 读取配置文件
 *
 */
public class PropertiesUtil {
	
	private static Properties properties = new Properties();
	
	static{
		try {
			properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream("yeepay.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取指定key的值
	 * @param key
	 * @return
	 */
	public static String getValue(String key){
		return properties.getProperty(key);
	}
}