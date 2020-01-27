package com.practice.designpatterns.observer.example1;

public class StockTester {

	public static void main(String[] args) {

		StockGrabber stockGrabber = new StockGrabber();
		
		Observer observer1 = new StockObserver(stockGrabber);
		Observer observer2 = new StockObserver(stockGrabber);
		
		
		stockGrabber.setFbPrice(10);
		stockGrabber.setIbmPrice(110);
		
//		stockGrabber.notifyObserver();
		
	}

}
