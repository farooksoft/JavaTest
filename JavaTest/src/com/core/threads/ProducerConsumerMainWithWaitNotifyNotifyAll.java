package com.core.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * 	1) Producer thread produce a new resource in every 1 second and put it in �taskQueue�.
	2) Consumer thread takes 1 seconds to process consumed resource from �taskQueue�.
	3) Max capacity of taskQueue is 5 i.e. maximum 5 resources can exist inside �taskQueue� at any given time.
	4) Both threads run infinitely.

 * @author srayabar
 *
 */
public class ProducerConsumerMainWithWaitNotifyNotifyAll {
	
	public static void main(String[] args) {
		List<Integer> taskQueue = new ArrayList<Integer>();
		int MAX_CAPACITY = 5;
		Thread tProducer = new Thread(new Producer1(taskQueue, MAX_CAPACITY), "Producer");
		Thread tConsumer = new Thread(new Consumer1(taskQueue), "Consumer");
		tProducer.start();
		tConsumer.start();
	}
}

class Producer1 implements Runnable{
	
	private final List<Integer> taskQueue;
	private final int MAX_CAPACITY;
	
	public Producer1(List<Integer> sharedQueue, int size) {
		this.MAX_CAPACITY = size;
		this.taskQueue = sharedQueue;
	}
	
	@Override
	public void run() {
		int counter = 0;
		
		while(true){ //infinite loop
			try {
				produce(counter++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void produce(int i) throws InterruptedException {
		synchronized (this.taskQueue) {
			if(this.MAX_CAPACITY == this.taskQueue.size()){
				System.out.println("Queue is full "+ Thread.currentThread().getName()+" is waiting, size is : " + this.taskQueue.size());
				this.taskQueue.wait();
			}
			Thread.sleep(2000); //1 second sleep
			this.taskQueue.add(i);
			System.out.println("Produced - " + i);
			this.taskQueue.notifyAll();
		}
	}
	
}

class Consumer1 implements Runnable{
	private final List<Integer> taskQueue;
	
	public Consumer1(List<Integer> sharedQueue) {
		this.taskQueue = sharedQueue;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}

	private void consume() throws InterruptedException {
		synchronized (this.taskQueue) {
			if(this.taskQueue.isEmpty()){
				System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting, size is : " + this.taskQueue.size());
				this.taskQueue.wait();
			}
			Thread.sleep(500); //1 second sleep
			Integer removed = this.taskQueue.remove(0);
			System.out.println("Consumed - " + removed);
			this.taskQueue.notifyAll();
		}
	}
	
}