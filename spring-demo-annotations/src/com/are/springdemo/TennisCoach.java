package com.are.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Dzi� �wiczymy bieganie po �cianie";
	}

}
