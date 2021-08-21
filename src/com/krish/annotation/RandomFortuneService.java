package com.krish.annotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data={"happy day 1","Good Day 2"," Enjoy your Day 3"};
	
	private Random r=new Random();
	@Override
	public String getFortune() {
		int index=r.nextInt(data.length);
		String s=data[index];
		return s;
	}

}
