package com.netcracker.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Adder {

	public int add(int x, int y)
	{
		return x+y;
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class cls = Adder.class;
		Class[] params = new Class[2];
		params[0]=Integer.TYPE;
		params[1]=Integer.TYPE;
		
		Method m = cls.getMethod("add", params);
		
		Integer x = 10;
		Integer y = 20;
		Object res = m.invoke(new Adder(),	new Object[] {x,y});
		
		System.out.println((Integer)res);
	}
}
