package com.krish.annotation;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String  email;
	@Value("${foo.name}")
	private String name;
	
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public SwimCoach(FortuneService thefortuneService)
	{
		fortuneService=thefortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
