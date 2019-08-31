package com.netcracker.exceptions.caseStudy;

public class KidUsers extends User implements LibraryUser {
	
	@Override
	public String registerAccount() {

		String result;
		
		if (getAge() < 12 && getAge() > 0)
		{
			result = "You have successfully registered under a Kids Acoount";
			setActive(true);
		}

		else
		{
			result = "Sorry, age must be less than 12 to register as a kid";
		}
		
		return result;

	}

	@Override
	public String requestMovie() {
		
		String result;
		
		if(MovieType.Animation==getMovieType()&&isActive())
		{
			result = "Movie issued successfully, please return the movie within 10 days";
		}
		
		else
		{
			result = "Oops, you are allowed to take only animated movies";
		}
		
		return result;
	}

}
