package com.core.threads;

import java.util.Iterator;
import java.util.Vector;

/**
 * Program has Producer and Consumer classes and a data Vector.
 * 
 * @author srayabar
 *
 */
public class ProducerConsumerMain {
	
	//thread-safe; synchronized
	private static Vector<String> data = new Vector<String>();
	
	//private static List<Object> data1 = Collections.synchronizedList(new ArrayList<Object>());
	
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
                        System.out.println("Consumed.."+it.next());
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
                data.add("Produced");
                if (data.size() > 1000)
                    data.remove(data.size() - 1);
            }
        }
    }
}