package com.exam;

public class ProducerConsumer {
public static void main(String[] args) {
	Order o=new Order();
	new Producer(o);
	new Consumer(o);
	System.out.println("Press ctrl+c to stop");
}
}
