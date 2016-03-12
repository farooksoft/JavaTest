package com.core.threads;

public class EvenOddPrintThreadMain {
	
	public static void main(String[] args) {

		Thread t1 = new Thread(new LogicThread("thread1", 10));
		Thread t2 = new Thread(new LogicThread("thread2", 10));
		
		t1.start();
		
		try {
			t1.join(); //mandates sequential flow
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----------");
		t2.start();
	}
	
}

class LogicThread implements Runnable{

	int rotations = 0;
	int count = 0;
	String tName = "";
	
	public LogicThread(String name, int num) {
		this.rotations = num;
		this.tName = name;
	}
	@Override
	public void run() {
		for(int i=0; i<this.rotations; i++){
			if(this.tName.equals("thread1")){
				int j = this.count++;
				if(j%2 == 0){
					System.out.println( this.tName +" - "+ j + " ");
				}
			}else if(this.tName.equals("thread2")){
				int j = this.count++;
				if(j%2 == 1){
					System.out.println( this.tName + " - " + j + " ");
				}
			}
		}
	}
}