package com.apps.chatapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket serverSocket;
	Socket socket;
	BufferedReader bufferedReader, input;
	PrintStream stream;

	public Server() {
		try {
			serverSocket = new ServerSocket(2001);
			bufferedReader = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("Server started");
			while (true) {
				socket = serverSocket.accept();
				stream = new PrintStream(socket.getOutputStream(), true);
				System.out.println("Enter Message for client");
				String msg = bufferedReader.readLine();
				stream.print(msg);

				input = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				System.out.println("From Client : " + input.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Server();
	}
}
