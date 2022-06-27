package com.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class NoxmlDemoApp {

	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		CircketCoach thecoach = context.getBean("circketCoach",CircketCoach.class);
		
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortune());
		System.out.println(thecoach.output1());
		
		context.close();

	}

}
