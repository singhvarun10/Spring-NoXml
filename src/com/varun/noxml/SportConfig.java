package com.varun.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//Commented out component scan as we are using the below components so no component scan needed
// Already inserted the required components
//@ComponentScan("com.varun.noxml")
//For reading property file
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public Fortune sadFortune() {
		return new SadFortune();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortune());
	}
}
