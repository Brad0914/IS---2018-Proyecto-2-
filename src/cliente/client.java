package cliente;

import java.io.DataOutputStream;
import java.io.IOException;

import servidor.socket;


public class client extends socket{

	public client() throws IOException {
		super("client");
	}
	 
	public void start() {
		try {
			exitServer = new DataOutputStream(socket.getOutputStream());
			
			socket.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
