package servidor;

import java.io.IOException;

public class MainServidor {
 
	public static void main(String[] args)  throws IOException {
	       
			server serv = new server(); //Se crea el servidor

	        System.out.println("Iniciando servidor");
	        serv.start(); //Se inicia el servidor
	    }
}


