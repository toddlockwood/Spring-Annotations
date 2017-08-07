package com.are.springdemo;

import java.awt.SystemColor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
	System.out.println("TennisCoach: Jesteœmy w konstruktorze domyœlnym");
	}
	
	//Metoda na start
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("START :D");
	}
	//Metoda na Destroy
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("Destroy!");
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println("TennisCoach: Jesteœmy w setterze");
//
//		fortuneService = theFortuneService;
//	}
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		
		return "Dziœ æwiczymy bieganie po œcianie";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
