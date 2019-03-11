package com.aslihankocabas.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.aslihankocabas.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// define bean for our sad fortune service
	// method ismi bean id olacakt�r
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	// define bean for our swim coach AND inject dependency
    @Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
}
