package com.core.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {

	public String[] adviceList = { "Drink More Water!", "Jog Every Day",
			"Don't Believe Rohit Idiot :)", "Build the Personality" };

	public static void main(String[] args) {
		DailyAdviceServer adviceServer = new DailyAdviceServer();
		adviceServer.go();
	}

	private void go() {

		try {
			ServerSocket serverSocket = new ServerSocket(4040);
			System.out.println("Server started..!!");
			while (true) {
				Socket socket = serverSocket.accept();
				PrintWriter printWriter = new PrintWriter(
						socket.getOutputStream());
				String advice = getAdvice();
				printWriter.println(advice);
				printWriter.close();
				System.out.println(advice);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String getAdvice() {
		int random = (int) Math.random() * adviceList.length;
		return adviceList[random];
	}
}