package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class NetTest {

	public static void main(String[] args) throws UnknownHostException {
		//输出ip地址
		/*InetAddress in = InetAddress.getByName("www.baidu.com");
		String id = in.getHostAddress();
		System.out.println(id);*/
		BufferedReader bufferedReader = null;
		try {
			URL url = new URL("https://www.baidu.com");
			InputStream inputStream = url.openStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			String lineDate = null;
			while((lineDate = bufferedReader.readLine()) != null) {
				System.out.println(lineDate);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
