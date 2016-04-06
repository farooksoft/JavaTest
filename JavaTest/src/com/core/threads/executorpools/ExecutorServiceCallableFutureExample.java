package com.core.threads.executorpools;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceCallableFutureExample {
	
	public static void main(String[] args) {
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		
		List<Future<Integer>> futuresList = new ArrayList<Future<Integer>>();
		Random random = new Random();
		
		for(int i=0; i<=4; i++){
			int nextInt = random.nextInt(10);
			FactorialCalculator calculator = new FactorialCalculator(nextInt);
			Future<Integer> submitFuture = executor.submit(calculator);
			futuresList.add(submitFuture);
		}
		
		try {
			for(Future<Integer> future : futuresList){
				System.out.println("task value :" + future.get() + ", is completed : " + future.isDone());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		executor.shutdown();		
	}
}

class FactorialCalculator implements Callable<Integer>
{ 
    private Integer number;
 
    public FactorialCalculator(Integer number) {
        this.number = number;
    }
 
    @Override
    public Integer call() throws Exception {
        int result = 1;
        if ((this.number == 0) || (this.number == 1)) {
            result = 1;
        } else {
            for (int i = 2; i <= this.number; i++) {
                result *= i;
                TimeUnit.MILLISECONDS.sleep(20);
            }
        }
        System.out.println("Result for number - " + this.number + " -> " + result);
        return result;
    }
}