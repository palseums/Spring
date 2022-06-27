package com.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeanDemoApp {

	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach thecoach = context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortune());
		System.out.println(thecoach.getEmail());
		System.out.println(thecoach.getTeam());
		
		context.close();

	}

}
