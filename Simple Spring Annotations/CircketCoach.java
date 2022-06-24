package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Here you are defining the bean id - The bean id is gullycoach 
// @Component("gullycoach")
// To use the default bean id don't give any name. The default bean id will be class name with starting letter as small case
// like cricketCoach ( bean id )
@Component
public class CircketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	// Here we are injecting another class ( FortuneService )  in the constructor with the help of Autowired option.
	// Here FortuneService is a Interface and Autowired will check which class implemented this FortuneService in our case
	// It is HappFortuneService class
	@Autowired
	public CircketCoach(FortuneService thefortuneService)
	{
		this.fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your batting technique";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
