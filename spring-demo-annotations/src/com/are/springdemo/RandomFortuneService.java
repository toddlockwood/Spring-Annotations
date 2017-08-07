package com.are.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"¯uczki",
			"Koale",
			"Misie"
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		
		int randomindex = random.nextInt(data.length);
		String theFortune = data[randomindex];
		return theFortune;
	}

}
