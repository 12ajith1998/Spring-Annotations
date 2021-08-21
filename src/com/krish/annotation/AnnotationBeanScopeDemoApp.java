package com.krish.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach a=context.getBean("tennisCoach",Coach.class);
		Coach b=context.getBean("tennisCoach",Coach.class);
		boolean rs=(a==b);
		System.out.println(rs);
		System.out.println(a);
		System.out.println(b);
	}

}
