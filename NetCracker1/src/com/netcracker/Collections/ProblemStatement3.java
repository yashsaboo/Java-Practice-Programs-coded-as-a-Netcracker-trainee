package com.netcracker.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ProblemStatement3 {
	private Map<String, String> CountryMap = new HashMap<>();
	private Map<String, String> CapitalMap = new HashMap<>();
	public void storeCountryCapital(String country, String capital)
	{
		CountryMap.put(country, capital);
	}
	public String retrieveCountry(String capital)
	{
		for(String country:CountryMap.keySet())
		{
			if(CountryMap.get(country).equals(capital))
				return country;
		}
		return null;
	}
	public String retrieveCapital(String country)
	{
		return CountryMap.get(country);
	}
	public Map<String,String> reverseMap()
	{
		//Map<String,String> CapitalMap= new HashMap<>();
		
		//IMPORTANT
		//IMPORTANT
		//IMPORTANT
		//IMPORTANT
		//IMPORTANT
		//IMPORTANT
		//IMPORTANT
		for(Entry<String, String> entry:CountryMap.entrySet())
		{
			CapitalMap.put(entry.getValue(), entry.getKey());
		}
		//IMPORTANT
		//IMPORTANT
		//IMPORTANT
		//IMPORTANT
		//IMPORTANT
		//IMPORTANT
		return CapitalMap;
	}
	public void printCapital()
	{
		for(Entry<String, String> entry:CountryMap.entrySet())
		{
			System.out.println(entry.getValue()+" ");
		}
	}
	public void printCountry()
	{
		for(Entry<String, String> entry:CountryMap.entrySet())
		{
			System.out.println(entry.getKey()+" ");
		}
	}
	public static void main(String args[])
	{
		ProblemStatement3 obj = new ProblemStatement3();
		obj.storeCountryCapital("India", "Delhi");
		obj.storeCountryCapital("USA", "Washington");
		obj.storeCountryCapital("Japan", "Tokyo");
		System.out.println(obj.retrieveCapital("India"));
		System.out.println(obj.retrieveCountry("Delhi"));
		System.out.println(obj.CountryMap);
		System.out.println(obj.reverseMap());
		System.out.println();
		System.out.println("Capitals are:");
		obj.printCapital();
		System.out.println();
		System.out.println("Countries are:");
		obj.printCountry();
	}
}
