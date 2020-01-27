package com.practice.designpatterns.observer.example1;

public interface Subject {

	public void register(Observer observer);	
	public void unregister(Observer observer);	
	public void notifyObserver();
	
}