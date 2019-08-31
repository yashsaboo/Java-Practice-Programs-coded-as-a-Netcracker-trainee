package com.netcracker.exceptions.caseStudy;

public class AdultUser extends User implements LibraryUser {
	
	@Override
	public String registerAccount() {
		
		String result;
		
		if (getAge() >= 12)
		{
			result = "You have successfully registered under a Adults Acoount";
			setActive(true);
		}

		else
		{
			result = "Sorry, age must be less than 12 to register as an adult";
		}
		
		return result;

	}

	@Override
	public String requestMovie() {
		
		String result;
		
		if(MovieType.Action == getMovieType() && isActive())
		{
			result = "Movie issued successfully, please return the movie within 7 days";
		}
		
		else
		{
			result = "Oops, you are allowed to take only adult action movies";
		}
		
		return result;
		
	}
}
