package com.practice.designpatterns.strategy.example1;

public class Tester {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal bird = new Bird();
		
		System.out.println(dog.tryToFly());
		System.out.println(bird.tryToFly());
		
		
	}

}
