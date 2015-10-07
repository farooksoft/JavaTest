package com.core.threads;

import java.util.Iterator;
import java.util.Vector;

/**
 * Has Producer class and Consumer class and a data Vector.Doesn't use any threads for the problem solution
 * 
 * @author srayabar
 *
 */
public class ProducerConsumerMain {
	
	private static Vector<Object> data = new Vector<Object>();
	 
    public static void main(String[] args) {
        new Producer().start();
        new Consumer().start();
    }
 
    public static class Consumer extends Thread {
    	
        Consumer() {
            super("Consumer"); //setting the string name here
        }
 
        @Override
        public void run() {
            for (;;) { //infinite loop
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                synchronized(data){
                	@SuppressWarnings("rawtypes")
                    Iterator it = data.iterator();
                    while (it.hasNext())
                        System.out.println(it.next());
                }
                
            }
        }
    }
 
    public static class Producer extends Thread {
    	
        Producer() {
            super("Producer"); //setting the string name here
        }
 
        @Override
        public void run() {
            for (;;) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("adding");
                data.add(new Object());
                if (data.size() > 1000)
                    data.remove(data.size() - 1);
            }
        }
    }
}