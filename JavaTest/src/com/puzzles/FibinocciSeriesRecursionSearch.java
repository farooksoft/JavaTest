package com.puzzles;

import java.util.Scanner;

/**
 * Find Fibinocci series and find nth number using Recursion
 * ex : 0 1 1 2 3 5 8 13 21.........n
 * 
 * @author srinath.rayabarapu 
 */
public class FibinocciSeriesRecursionSearch {

	public static int findFibinocciSeriesElement(int index) {
		
		if(index == 1 ){
			return 0;
		}
		if(index == 2 ){
			return 1;
		}
		return (findFibinocciSeriesElement(index-1)+findFibinocciSeriesElement(index-2));
	}
	
	public static void main(String[] args) {
		/*Scanner reader = new Scanner(System.in);
		int iNumber = reader.nextInt();*/

		//System.out.println(findFibinocciSeriesElement(100));
		
		FibinocciSeriesRecursion seriesRecursion = new FibinocciSeriesRecursion(10);
		
		Thread thread = new Thread(seriesRecursion);
		thread.start();
		try {
			thread.join(); // waits current thread till spanned thread completes execution
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hi");
		
		System.out.println(seriesRecursion.getNumber());		
	}

}


class FibinocciSeriesRecursion implements Runnable{
	int number;
	String name;
	
	public FibinocciSeriesRecursion(int number) {
		this.number = number;
	}
	@Override
	public void run() {
		setNumber(calculateFibinocc(this.number));
	}
	
	public int calculateFibinocc(int num){
		if(num == 1){
			return 0;
		}
		if(num == 2){
			return 1;
		}
		return (calculateFibinocc(num-1) + calculateFibinocc(num-2));
	}
	
	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}