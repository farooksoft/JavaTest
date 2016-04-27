package com.core.threads.advanced;

/**
 * The ThreadLocal class in Java enables you to create variables that can only be read and written by the same thread. 
 * Thus, even if two threads are executing the same code, and the code has a reference to a ThreadLocal variable, then 
 * the two threads cannot see each other's ThreadLocal variables.<p>
 * 
 * http://tutorials.jenkov.com/java-concurrency/threadlocal.html
 * 
 * @author srayabar
 */
public class ThreadLocalDemo {
	
	public static class MyRunnable implements Runnable{
		
		private static ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
			@Override
			protected String initialValue() {
				return "init value set";
			}
		};
		
		@Override
		public void run() {
			System.out.println("Running thread - " + Thread.currentThread().getName());
			
			//even though same object is set value by two different threads, the values are retained per thread
			threadLocal.set(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadLocal.get());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyRunnable(), "t1");
		Thread t2 = new Thread(new MyRunnable(), "t2");
		
		t1.start();
		t2.start();
		
		//won'e let main program to end until these two threads completes it's execution
		t1.join();
		t2.join();
	}
}