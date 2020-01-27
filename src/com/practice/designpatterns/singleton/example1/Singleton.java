package com.practice.designpatterns.singleton.example1;

import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {

	private static Singleton instance = null;

	String[] scrabbleLetters = { "a", "b", "s", "e", "a", "b", "s", "e", "a", "b", "s", "e", "a", "b", "s", "e" };

	private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

	static boolean firstThread = true;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			if (firstThread) {
				System.out.println("inside first thread");
				firstThread = false;
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("out first thread");
			}

			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public LinkedList<String> getLettersList() {
		return instance.letterList;
	}

	public LinkedList<String> getTiledList(int num) {
		LinkedList<String> tiledList = new LinkedList();
		for (int i = 0; i < num; i++) {
			tiledList.add(instance.letterList.remove(0));
		}
		return tiledList;
	}
}
