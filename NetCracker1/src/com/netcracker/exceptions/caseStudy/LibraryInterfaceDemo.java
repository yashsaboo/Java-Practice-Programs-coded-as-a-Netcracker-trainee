package com.netcracker.exceptions.caseStudy;

public class LibraryInterfaceDemo {

	public static void main(String[] args)
	{
		KidUsers user = new KidUsers();
		user.setAge(10);
		System.out.println(user.registerAccount());
		user.setMovieType(MovieType.Action);
		System.out.println(user.requestMovie());
		
		AdultUser adult = new AdultUser();
		adult.setAge(10);
		System.out.println(adult.registerAccount());
		adult.setMovieType(MovieType.Action);
		System.out.println(adult.requestMovie());
	}

}
