package servidor;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
 
public class socket {
	
	protected ServerSocket server;
	protected Socket socket;
	private int port = 1234;
	public DataOutputStream exitServer, exitClient;
	public BufferedReader entry;
	private String ip = "127.0.0.1";
	public String message;
	
	public socket(String type) throws IOException{
			if (type.equals("server")) {
				this.server = new ServerSocket(port);
				this.socket = new Socket();
			}
			else {
				this.socket = new Socket(ip, port);
			}
	}
	
}

