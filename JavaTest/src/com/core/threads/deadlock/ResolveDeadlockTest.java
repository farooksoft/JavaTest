package com.core.threads.deadlock;

import java.util.ArrayList;
import java.util.List;

/**
 * when two or more threads are waiting for each other to release lock and get stuck for infinite time, 
 * situation is called deadlock . It will only happen in case of multitasking.
 * 
 * @author srayabar
 *
 */
public class ResolveDeadlockTest {
	
	public static void main(String[] args) {
		
		final List<String> namesList = new ArrayList<String>();
		final List<String> subjectsList = new ArrayList<String>();
		
		Runnable readNames = new Runnable() {
			@Override
			public void run() {				
				//synchronized is a way to acquire lock on Object
				synchronized (namesList) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (subjectsList) {
						System.out.println("In readNames");
					}
				}				
			}
		};
		
		Runnable readSubjects = new Runnable() {			
			@Override
			public void run() {				
				synchronized (namesList) {	//subjectsList
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (subjectsList) { //namesList
						System.out.println("In readSubjects");
					}
				}
			}
		};
		
		//if we replace the commented values then we will get a Deadlock
		
		new Thread(readNames).start();
		new Thread(readSubjects).start();
		
	}
	
}