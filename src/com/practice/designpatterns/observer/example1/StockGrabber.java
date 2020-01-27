package com.practice.designpatterns.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

	private List<Observer> observers;
	private double ibmPrice;
	private double fbPrice;

	public StockGrabber() {
		observers = new ArrayList<>();
	}

	public double getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public double getFbPrice() {
		return fbPrice;
	}

	public void setFbPrice(double fbPrice) {
		this.fbPrice = fbPrice;
		notifyObserver();
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer delObserver) {
		int indexOfObserver = observers.indexOf(delObserver);
		observers.remove(indexOfObserver);
		System.out.println("Observer at index " + (indexOfObserver + 1) + " removed");
	}

	@Override
	public void notifyObserver() {
		observers.forEach(observer -> observer.update(ibmPrice, fbPrice));
	}

}
