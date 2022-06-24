package com.spring.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService  {

	

	
	private String[] data = {
			"Hello",
			"how",
			"Are",
			"You"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		
		return data[index];
	}
	
	
}
