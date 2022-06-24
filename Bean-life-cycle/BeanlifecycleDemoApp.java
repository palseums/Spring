package com.spring.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanlifecycleDemoApp {

	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle.xml");
		
		Coach thecoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(thecoach.getDailyFortune());
		System.out.println(thecoach.getDailyWorkout());
		
		context.close();

	}

}
