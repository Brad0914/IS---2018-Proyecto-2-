package sockets;

import java.net.*;
import java.io.*;

public class Socket1 {
	
	ServerSocket server;
	Socket socket;
	int port = 9000;
	DataOutputStream exit;
	BufferedReader entry;
	String ip = "localhost"; 
	
	public void start() {
		try {
			server = new ServerSocket(port);
			socket = new Socket();
			socket = server.accept();
			
			entry = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message = entry.readLine();
			
			System.out.println(message);
			
			exit = new DataOutputStream(socket.getOutputStream());
			exit.writeUTF("sirvio");
			
			socket.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
