package homework;

import org.apache.log4j.Logger;

public class TestLog4j {

	private static final Logger logger = Logger.getLogger(TestLog4j.class);

	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			e.printStackTrace();
			logger.debug(e.getMessage(),e);//详细日报信息
			logger.info(e.getMessage(),e);//详细日报信息
			logger.warn(e.getMessage());//简单日报信息
			logger.error(e.getMessage());//简单日报信息
		}
		
    }
}
