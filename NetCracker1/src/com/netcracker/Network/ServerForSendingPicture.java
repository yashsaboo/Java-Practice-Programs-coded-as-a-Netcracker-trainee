package com.netcracker.Network;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

public class ServerForSendingPicture {

	public static void main(String[] args) throws IOException {
		
		//create server socket and open port
		
		ServerSocket server = new ServerSocket(5555);
		
		System.out.println("Server started on port 5555");
		System.out.println("Waiting for network...");
			
		Socket socket = server.accept();//This call will run indefinite time until the connection gets established
		
		java.io.OutputStream out = socket.getOutputStream();
		FileInputStream in = new FileInputStream("src/100_1411.jpg");
		
		byte [] data = new byte[100];
		while(in.read(data)!=-1)
		{
			out.write(data);
		}
		
		in.close();
		out.close();
		
		System.out.println("End of Program");
		
		socket.close();
		server.close();
	
	
	}

}
