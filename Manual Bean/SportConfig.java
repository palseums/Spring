package com.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
	
	//Manual bean definition
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	// define bean for our swim coach and  fortune service
	
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());
	}

}
