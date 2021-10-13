package com.varun.noxml;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SadFortune implements Fortune {

	@Override
	public String giveFortune() {
		return "Today is going to be a bad day";
	}

}
