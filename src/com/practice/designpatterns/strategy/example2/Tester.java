package com.practice.designpatterns.strategy.example2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fighter sam = new Sam(new LongJump(), new TornadoKick());
		
		sam.display();
		sam.punch();
		sam.kick();
		sam.jump();
		
		
		
	}

}
