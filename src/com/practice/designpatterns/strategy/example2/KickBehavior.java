package com.practice.designpatterns.strategy.example2;

public interface KickBehavior {

	public void kick();

}

class TornadoKick implements KickBehavior {

	@Override
	public void kick() {
		System.out.println("Tornado Kick");
	}

}

class LighentingKick implements KickBehavior {

	@Override
	public void kick() {
		System.out.println("Lighening Kick");
	}

}