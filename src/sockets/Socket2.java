package sockets;
import java.net.*;



import java.io.*;

public class Socket2 {
	Socket client;
	int port = 9000;
	String ip = "localhost";
	BufferedReader entry, keyboard;
	PrintStream exit;
	
	
	public void start() {
		try {
			client = new Socket(ip, port);
			
			
			
			entry = new BufferedReader(new InputStreamReader(client.getInputStream()));
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			String keys = keyboard.readLine();
			
		
			
			exit = new PrintStream(client.getOutputStream());
			exit.println(keys);
			
			String message = entry.readLine();
			
			System.out.println(message);
			
			entry.close();
			exit.close();
			keyboard.close();
			client.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
