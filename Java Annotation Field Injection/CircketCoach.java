package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Here you are defining the bean id - The bean id is gullycoach 
// @Component("gullycoach")
// To use the default bean id don't give any name. The default bean id will be class name with starting letter as small case
// like cricketCoach ( bean id )
@Component
public class CircketCoach implements Coach {
	
	// Here the autowired option check which class implemented the FortuneService service  
	
	@Autowired
	private FortuneService fortuneService;
	
	
	@Autowired
	private HappyFortuneService theHappyFortuneService;
	
	
	
	
	public CircketCoach()
	{
		System.out.println("You are inside the CircketCoach Constructor");
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
	
	
	public String output1()
	{
		return "Happy " + theHappyFortuneService.getFortune();
	}

}
