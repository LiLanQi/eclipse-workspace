package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestSocker {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket chatSocket = new Socket("127.0.0.1",80);
		InputStreamReader stream = new InputStreamReader(chatSocket.getInputStream());
		BufferedReader reader = new BufferedReader(stream);
		String message = reader.readLine();
		System.out.println("sdasdasdasd"+message);
		reader.close();
	}
}
