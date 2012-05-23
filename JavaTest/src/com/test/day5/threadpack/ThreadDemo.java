package com.test.day5.threadpack;

public class ThreadDemo {
	public void firstMethod(){
		for(int i=0;i<5;i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void secondMethod(){
		
		System.out.println("Second method called");
	}
	public static void main(String[] args) {
		ThreadDemo demo = new ThreadDemo();
		new ChildThread(demo);
		demo.firstMethod();
//		demo.secondMethod();
	}
}
class ChildThread implements Runnable{
	Thread thread; ThreadDemo demo;
	public ChildThread(ThreadDemo demo) {
		this.demo=demo;
		thread = new Thread(this);
		thread.start();
	}
	
//	@Override
	public void run() {
			demo.secondMethod();
	}
}