package com.varun.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TennisCoach implements Coach {
	
	@Autowired
	Fortune dailyFortune;

	@Override
	public String getDailyWorkout() {
		return "Move your racket";
	}

	@Override
	public String getDailyFortune() {
		return dailyFortune.giveFortune();
	}
	
	

}
