package com.aslihankocabas.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	//field injection
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	// construction injection
	public SwimCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	
	

}
