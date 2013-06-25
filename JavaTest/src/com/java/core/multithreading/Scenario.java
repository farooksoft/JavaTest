package com.java.core.multithreading;

public class Scenario {
 public static void main(String[] args) {
	ReservationCounter apsrtc=new ReservationCounter();
	new CreateThread("samba",1000,apsrtc);
	new CreateThread("akula",1500,apsrtc);
	System.out.println("The Scenario In the" +"APSRTC Reservation counter");
}
 
}
