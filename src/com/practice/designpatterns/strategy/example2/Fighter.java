package com.practice.designpatterns.strategy.example2;

public abstract class Fighter {

	public JumpBehavior jumpBehvior;
	public KickBehavior kickBehavior;

	public Fighter(JumpBehavior jumpBehvior, KickBehavior kickBehavior) {
		this.jumpBehvior = jumpBehvior;
		this.kickBehavior = kickBehavior;
	}

	public void kick() {
		kickBehavior.kick();
	}

	public void jump() {
		jumpBehvior.jump();
	}

	public void punch() {
		System.out.println("Punch");
	}

	public void roll() {
		System.out.println("Roll");
	}
	
	public abstract void display();
	
	

}
