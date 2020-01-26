package com.practice.designpatterns.strategy.example2;

public class Sam extends Fighter {

	public Sam(JumpBehavior jumpBehvior, KickBehavior kickBehavior) {
		super(jumpBehvior, kickBehavior);
	}

	@Override
	public void display() {
		System.out.println("Sam");
	}

	
	
}
