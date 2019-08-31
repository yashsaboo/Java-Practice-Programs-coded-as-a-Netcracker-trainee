//ReflectionClass

package com.netcracker.Reflection;

import java.lang.reflect.Method;

public class FindMethod {

	public static void main(String[] args) {
		
		Class cls = Point.class;
		Method[] methods = cls.getDeclaredMethods();
		
		for(Method m:methods)
		{
			System.out.println(m.getReturnType());
			System.out.println(m.getName());
			
			Class[] params = m.getParameterTypes();
			for(Class p:params)
			{
				System.out.println(p.getTypeName());
			}
		}
	}

}
