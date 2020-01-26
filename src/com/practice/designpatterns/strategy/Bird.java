package com.practice.designpatterns.strategy;

public class Bird extends Animal {

	
	public Bird() {
		super();
		setSound("Tweet");
		
		setFlyingType(new ItFlys());
	}
	
	
}
