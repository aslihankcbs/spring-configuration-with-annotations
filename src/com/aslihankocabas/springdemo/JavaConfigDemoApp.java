package com.aslihankocabas.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

	   // read spring config file
	  // configuration -> java configuration class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);

	   // get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
	   // call a method on the bean
	   System.out.println(theCoach.getDailyWorkOut());
	   
	   // call method to get the daily fortune
	   System.out.println(theCoach.getDailyFortune());
	   
	   // close the context
	   context.close();
	}

}
