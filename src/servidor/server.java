package servidor;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
 

public class server extends socket {
	
	public server() throws IOException{
		super("server");
	}
	
	public void start() {
		try {
			System.out.println("Esperando...");
			
			socket = server.accept();
			
			System.out.println("Cliente en linea");
			
			exitClient = new DataOutputStream(socket.getOutputStream());
			
			exitClient.writeUTF("Peticion recibida y aceptada");
			
			BufferedReader entry = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while ((this.message = entry.readLine()) != null) {
				System.out.println(message);
			}
			System.out.println("terminó");
			
			server.close();
			
		} catch (Exception e) {
			System.out.println("Se cayó la conexión");
		}
	}
}
