package com.netcracker.Collections;

import java.util.HashMap;
import java.util.Map;

public class UsingMap {

	public static void main(String[] args) {
		
		Map<String, String> cities = new HashMap<>();
		cities.put("MAH", "Mumbai");
		cities.put("KA", "Bangalore");
		cities.put("TN", "Chennai");
		cities.put("MAH", "Pune"); //as Key can't be duplicated so Mumbai will be replaced by Pune.
								   //So always keep Key different
		
		System.out.println(cities); 
		
		Map<String, String> cities2 = new HashMap<>();
		cities2.put("Mumbai", "MAH");
		cities2.put("Bangalore", "KA");
		cities2.put("Chennai", "TN");
		cities2.put("Pune", "MAH");
		
		System.out.println(cities2); 

		//Print cities that belong to MAH
		for (String city:cities2.keySet())
		{
			if(cities2.get(city).equals("MAH"))
				System.out.println(city);
		}
	}

}
