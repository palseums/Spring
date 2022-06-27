package com.spring.annotations;

public class SwimCoach implements Coach {

	
	private FortuneService theFortuneService;
	
	
	public SwimCoach(FortuneService theFortuneService) {
		
		this.theFortuneService = theFortuneService;
	}

	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do your swimming daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return theFortuneService.getFortune();
	}

	
}
