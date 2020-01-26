package com.practice.designpatterns.strategy.example2;

public interface JumpBehavior {

	public void jump();
}

class LongJump implements JumpBehavior {

	@Override
	public void jump() {
		System.out.println("Long Jump");
	}

}

class ShortJump implements JumpBehavior {

	@Override
	public void jump() {
		System.out.println("Short Jump");
	}

}
