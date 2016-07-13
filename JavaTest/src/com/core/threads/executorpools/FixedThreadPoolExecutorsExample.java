package com.core.threads.executorpools;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * program to demo fixed thread pool with {@link TaskThread} class
 * 
 * @author srayabar
 */
public class FixedThreadPoolExecutorsExample {

	public static void main(String[] args) {
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
		TaskThread task;
		
		for(int i=0; i<=15; i++){
			task = new TaskThread("Task" + i);
			System.out.println("New task added : " + task.getName());
			executor.execute(task);
		}
		executor.shutdown();
		
		System.out.println("All tasks are submitted");
		
		try {
			executor.awaitTermination(5, TimeUnit.SECONDS);
			System.out.println("5 seconds delay is over");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("All tasks completed");
	}
}