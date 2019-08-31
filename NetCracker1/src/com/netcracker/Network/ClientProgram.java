/*
 * RUN TIHS  ON ANOTHER JAVA PROJECT, I.E. OPEN ANOTHER ECLIPSE ON DIFFERENT WORKSPACE AND THEN RUN THIS CODE ON THAT.
 */




package com.netcracker.Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientProgram {
	
	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket("localhost", 5555);
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		
		String message = reader.readLine();
		System.out.println(message);
		
		reader.close();
		socket.close();
	}

}

