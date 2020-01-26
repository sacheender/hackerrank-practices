package com.practice.designpatterns.strategy.example1;

public class Bird extends Animal {

	
	public Bird() {
		super();
		setSound("Tweet");
		
		setFlyingType(new ItFlys());
	}
	
	
}
