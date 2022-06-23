package com.spring.learning;

public class BaseballCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	
	public BaseballCoach()
	{
		System.out.println("Inside no-arg constructor");
	}
	
	public BaseballCoach(FortuneService theFortuneService) {
		
		System.out.println("Inside argument constructor");
		
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout()
	{
		return "spend 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
	
	

	
}
