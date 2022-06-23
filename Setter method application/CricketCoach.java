package com.spring.learning;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	
	private String emailaddress;
	
	private String team;
	
	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		System.out.println("Setting Email");
		this.emailaddress = emailaddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Setting Team");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice Fast bowling";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	public CricketCoach() {
		
		System.out.println("Inside the constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method");
		this.fortuneService = fortuneService;
	}
	
	

	

}
