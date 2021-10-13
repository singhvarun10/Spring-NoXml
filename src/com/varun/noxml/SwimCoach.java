package com.varun.noxml;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private Fortune fortune;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(Fortune fortune) {
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 metres today";
	}

	@Override
	public String getDailyFortune() {
		return fortune.giveFortune();
	}

}
