package com.varun.noxml;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DailyFortune implements Fortune {
	
	@Override
	public String giveFortune() {
		return "You will have a perfect day";
	}

}
