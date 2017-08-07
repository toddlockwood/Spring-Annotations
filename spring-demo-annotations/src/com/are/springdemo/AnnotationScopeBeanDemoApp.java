package com.are.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeBeanDemoApp {

	public static void main(String[] args) {
	
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach ==alphaCoach);
		
		System.out.println("Result is: "+result);
		
		System.out.println("theCoach memory: "+theCoach);
		System.out.println("alphaCoach memory: "+alphaCoach);

		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();

	}

	

}
