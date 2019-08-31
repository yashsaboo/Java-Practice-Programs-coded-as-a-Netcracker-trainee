package com.netcracker.IOExcerise;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;
import java.util.List;

public class ReverseFileContent {

	public ReverseFileContent() {
		// TODO Auto-generated constructor stub
	}
	
	public static void reverse(String readFile, String writeFile) throws Exception
	{
		File file = new File(writeFile);
		FileWriter writer = new FileWriter(file);
		FileReader fr = new FileReader(readFile);
		String c="";
		int i;
		while ((i = fr.read()) != -1) {
			c = c +(char) i + "";
			}
		System.out.println(c);
		StringBuilder str = new StringBuilder(c);
		c = str.reverse().toString();
		System.out.println(c);
		writer.write(c);
		writer.close();
	}
	
	public static void reverseContentsUsingNIO(File source, String name) throws Exception
	{
		Path sourcePath = Paths.get(source.getAbsolutePath());
		
		List<String> allLines = Files.readAllLines(sourcePath);
		PrintWriter out = new PrintWriter(new File(name));
		
		for(String line: allLines)
		{
			out.println(new StringBuilder(line).reverse());
		}
		out.close();
	}
	
	public static void main(String args[]) throws Exception
	{
		
		
		reverseContentsUsingNIO(new File("src/Original.txt"), "src/Reverse.txt");
		
		reverse("src/Original.txt", "src/Reverse.txt");
	}

}
