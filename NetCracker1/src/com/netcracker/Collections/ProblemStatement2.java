package com.netcracker.Collections;

import java.util.HashSet;
import java.util.Set;

public class ProblemStatement2 {
	
	private Set<String> Country = new HashSet<>();
	
	public void storeCountryNames(String CountryName)
	{
		Country.add(CountryName);
	}
	
	public String retrieveCountryNames(String whichCountry )
	{
		return Country.contains(whichCountry)?whichCountry:null;
	}

	public static void main(String[] args) {
		ProblemStatement2 obj = new ProblemStatement2();
		obj.storeCountryNames("India");
		obj.storeCountryNames("USA");
		obj.storeCountryNames("UK");
		obj.storeCountryNames("Egypt");
		obj.storeCountryNames("Canada");
		obj.storeCountryNames("India");
		System.out.println(obj.Country);//HastSet doesn't repeats the same element
		System.out.println(obj.retrieveCountryNames("India"));
	}

}
