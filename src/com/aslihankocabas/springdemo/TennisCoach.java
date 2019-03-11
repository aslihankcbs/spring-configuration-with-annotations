package com.aslihankocabas.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//this uses the default bean id
@Component
public class TennisCoach implements Coach {

	// Field Injection
	@Autowired
	//kullanmak istediðin sýnýfýn id sini ver
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	
	// define a default constructor
    public TennisCoach() {
		System.out.println(" >> TennisCoach : inside default constructor");
	}
    
    //define my init method
    @PostConstruct
    public void doMyStartupStuff() {
    	System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }
    
    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
    	System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }
    
	/*
	 --Constuctor injection
	 
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	*/
	/*
	 --Setter Injection
	//define a setter method 
    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
    	System.out.println(" >> TennisCoach : inside setFortuneService() method");
    	fortuneService= theFortuneService;
    }
    */
	@Override
	public String getDailyWorkOut() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
}
