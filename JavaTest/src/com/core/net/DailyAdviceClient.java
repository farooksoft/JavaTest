package com.core.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class DailyAdviceClient {

	public static void main(String[] args) {
		DailyAdviceClient adviceClient = new DailyAdviceClient();
		adviceClient.go();
	}

	private void go() {

		try {
			Socket socket = new Socket("127.0.0.1", 4040);
			InputStreamReader streamReader = new InputStreamReader(
					socket.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(streamReader);

			String advice = bufferedReader.readLine();
			System.out.println("Advice from Advice Guy : " + advice);

			bufferedReader.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
