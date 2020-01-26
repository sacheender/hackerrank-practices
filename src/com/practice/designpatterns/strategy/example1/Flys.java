package com.practice.designpatterns.strategy.example1;

public interface Flys {
String fly();
}


class ItFlys implements Flys{

	@Override
	public String fly() {
		return "Flying High";
	}
	
}

class CantFly implements Flys{

	@Override
	public String fly() {
		return "Can't Fly";
	}
	
}
