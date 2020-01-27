package com.practice.designpatterns.singleton.example1;

import java.util.LinkedList;

public class SingletonTester {
	public static void main(String[] args) {

		Singleton s = Singleton.getInstance();

		System.out.println(System.identityHashCode(s));

		Singleton s1 = Singleton.getInstance();

		System.out.println(System.identityHashCode(s1));
		System.out.println(s.getLettersList());
		LinkedList<String> playerOneTiles = s.getTiledList(3);
		System.out.println("playOneTiles: "+playerOneTiles);
		
		
		System.out.println(s1.getLettersList());
		LinkedList<String> playerTwoTiles = s1.getTiledList(3);
		System.out.println("playerTwoTiles: "+playerTwoTiles);
		
		System.out.println(s.getLettersList());
	}
}
