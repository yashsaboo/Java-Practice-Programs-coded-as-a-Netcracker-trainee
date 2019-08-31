package com.netcracker.Network;

import java.io.*;
import java.net.*;


public class DownloadPage {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://www.google.co.in/");
		
		InputStream in = url.openStream();
		OutputStream out = new FileOutputStream("google.htm");
		
		byte arr[] = new byte[100];
		
		while(in.read(arr)!=-1)
		{
			out.write(arr);
		}
		in.close();
		out.close();
		System.out.println("Page Downloaded");
		
		
	}

}
