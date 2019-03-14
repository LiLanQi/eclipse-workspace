package practice;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;

public class NewNetTest {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost/yeepayDemo/PayBeginServlet?name=lilanqi&message=fengyuming ");
		URLConnection urlConnection = url.openConnection();
		HttpURLConnection httpURLConnection= (HttpURLConnection)urlConnection;
		httpURLConnection.setRequestMethod("GET");
		httpURLConnection.setConnectTimeout(5000);
		httpURLConnection.setRequestProperty("accept", "*/*");//accept:设定客户端希望接受的数据类型。 */*:任何数据类型
		httpURLConnection.setRequestProperty("user-agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
		httpURLConnection.connect();
		int code = httpURLConnection.getResponseCode();
		if(code == 200) {
			InputStream inputStream = httpURLConnection.getInputStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String dateLine = null;
			while((dateLine = bufferedReader.readLine()) != null) {
				System.out.println(dateLine);
			}
		}
	}
}
