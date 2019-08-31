package com.netcracker.Network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {

	public static void main(String[] args) throws IOException {
		
		//create server socket and open port
		
		ServerSocket server = new ServerSocket(5555);
		
		System.out.println("Server started on port 5555");
		System.out.println("Waiting for network...");
			
		Socket socket = server.accept();//This call will run indefinite time until the connection gets established
		
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.println("Server: Welcome");
		out.close();
		
		System.out.println("End of Program");
		
		socket.close();
		server.close();
	
	
	}

}
