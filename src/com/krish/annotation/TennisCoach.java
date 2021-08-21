package com.krish.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	*/
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	@PostConstruct
	public void doMystartup()
	{
		System.out.println("doMystartup");
	}
	@PreDestroy
	public void doMyCleanUp()
	{
		System.out.println("doMyCleanUp");
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice your back hand valley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
