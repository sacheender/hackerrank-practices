package com.practice.designpatterns.singleton.example1;

import java.util.LinkedList;

public class SingletonThread implements Runnable {

	@Override
	public void run() {
		Singleton s = Singleton.getInstance();

		System.out.println(System.identityHashCode(s));
		System.out.println(s.getLettersList());
		LinkedList<String> playerOneTiles = s.getTiledList(3);
		System.out.println("play Tiles: " + playerOneTiles);
	}

}
