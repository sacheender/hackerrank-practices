package com.practice.designpatterns.observer.example1;

public class StockObserver implements Observer {

	private double ibmPrice;
	private double fbPrice;

	private static int obserberIdTracker = 0;
	private int observerId;

	private Subject stockGrabber;

	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerId = ++obserberIdTracker;
		System.out.println("New Observer Id : "+this.observerId);
		this.stockGrabber.register(this);
	}

	@Override
	public void update(double ibmPrice, double fbPrice) {
		this.ibmPrice = ibmPrice;
		this.fbPrice = fbPrice;
		
		printStockPrices();
	}

	public void printStockPrices() {
		// TODO Auto-generated method stub
		System.out.println("ibmPrice: "+ibmPrice+" ,\n fbPrice: "+fbPrice);
		
	}

}
