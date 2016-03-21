package com.core.threads.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

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
	}
}