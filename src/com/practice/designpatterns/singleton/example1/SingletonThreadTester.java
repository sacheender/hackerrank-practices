package com.practice.designpatterns.singleton.example1;

public class SingletonThreadTester {

	public static void main(String[] args) {
		Runnable t1 = new SingletonThread();
		Runnable t2 = new SingletonThread();

		new Thread(t1).start();
		new Thread(t2).start();
	}
}
