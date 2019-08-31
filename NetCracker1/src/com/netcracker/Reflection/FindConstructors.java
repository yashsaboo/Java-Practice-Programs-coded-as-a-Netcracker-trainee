package com.netcracker.Reflection;

import java.lang.reflect.Constructor;

public class FindConstructors {

	public static void main(String[] args) throws ClassNotFoundException {
		Class cls = Class.forName("com.netcracker.Reflection.Point");
		Constructor[] cons = cls.getConstructors();

		for (Constructor c : cons) {
			System.out.println(c.getName());
		}
		
		Class cls2 = Class.forName("java.util.ArrayList");
		Constructor[] cons2 = cls2.getConstructors();

		for (Constructor c : cons2) {
			System.out.println(c.getName());
		}
	}

}
