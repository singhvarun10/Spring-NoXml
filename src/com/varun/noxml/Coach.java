package com.varun.noxml;

import org.springframework.context.annotation.Configuration;

@Configuration
public interface Coach {
	
	public String getDailyWorkout();
	
	public String getDailyFortune();
}
