package com.netcracker.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FindFields {

	public static void main(String[] args) {

		Class cls = Point.class;
		Field[] fields = cls.getDeclaredFields();

		for (Field f : fields) {
			System.out.println(f.getType());
			System.out.println(f.getName());
		}
	}
}
