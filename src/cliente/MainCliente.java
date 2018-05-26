package cliente;

import java.io.IOException;


public class MainCliente {

	public static void main(String[] args)throws IOException{
		
		 
		client cli = new client(); //Se crea el cliente

        System.out.println("Iniciando cliente\n");
        cli.start(); //Se inicia el cliente
        
    }
}

