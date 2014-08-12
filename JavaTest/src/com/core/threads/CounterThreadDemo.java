package com.core.threads;

public class CounterThreadDemo {
	public static void main(String[] args) {
		ReservationCounter counter = new ReservationCounter();
		new CreateThread("Srinath", 500, counter);
		new CreateThread("Chaitanya", 1000, counter);
		System.out.println("Threads created");
	}
}
