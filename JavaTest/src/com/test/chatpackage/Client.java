package com.test.chatpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
	Socket socket; BufferedReader inputreader, input;
	PrintStream out;
	public Client() {
		try {
			input = new BufferedReader(new InputStreamReader(System.in));
			while(true){
			socket = new Socket("localhost",2001);
			inputreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(inputreader.readLine());

			out = new PrintStream(socket.getOutputStream(),true);
			System.out.println("Enter msg for server");
			String msg = input.readLine();
			out.print(msg);
			}
		} catch (Exception e){e.printStackTrace();}
	}
	public static void main(String[] args) {
		new Client();
	}
}