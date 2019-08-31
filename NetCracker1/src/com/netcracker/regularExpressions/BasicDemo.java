package com.netcracker.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicDemo {


	public static void main(String[] args) {
		String text = "Aa9!_";
		
		Pattern pattern = Pattern.compile("[A-Z]").compile("[a-z]").compile("[0-9]").compile("\\!").compile("_").compile("^beenil");
		
		Matcher matcher = pattern.matcher(text);
		
		if(matcher.find())
		{
			System.out.println("Found, bro");
		}
		else
		{
			System.out.println("And, you thought it was there. Idiot.");
		}
		int count = 0;
		
		matcher.reset();
		
		while(matcher.find())
		{
			count++;
		}
		System.out.println("Found "+count);
	}

}
