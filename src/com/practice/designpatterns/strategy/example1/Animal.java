package com.practice.designpatterns.strategy.example1;

public class Animal {
	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;

	
	public Flys FlyingType;
	
	
	public String tryToFly() {
		return FlyingType.fly();
	}
	
	public void setFlyingType(Flys fly) {
		FlyingType=fly;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			System.out.println("Weight should be greater than zero (0)");
		}
	}

	public String getFavFood() {
		return favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	
	
}
