package com.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeanDemoApp {

	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach thecoach = context.getBean("swimCoach",Coach.class);
		
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortune());
		
		
		context.close();

	}

}
