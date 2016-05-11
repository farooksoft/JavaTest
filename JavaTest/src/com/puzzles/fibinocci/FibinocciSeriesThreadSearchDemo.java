package com.puzzles.fibinocci;

/**
 * In fibinocci series find nth number using recursion with a thread
 * Actiance puzzle
 * ex : 1 1 2 3 5 8 13 21.........n
 * 
 * @author srinath.rayabarapu 
 */
public class FibinocciSeriesThreadSearchDemo {

	/*//default fibinocci series -
	public static int findFibinocciSeriesElement(int index) {
		if(index == 1 ){
			return 0;
		}
		if(index == 2 ){
			return 1;
		}
		return (findFibinocciSeriesElement(index-1)+findFibinocciSeriesElement(index-2));
	}
	*/
	
	public static void main(String[] args) {
		int n = 3;		
		FibinocciSeriesRecursion seriesRecursion = new FibinocciSeriesRecursion(n);		
		Thread thread = new Thread(seriesRecursion);
		thread.start();
		
		try {
			thread.join(); // waits till the thread completes execution
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println( n + " element in the Fibinocci series : " + seriesRecursion.getNumber());
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
		if(num == 1 || num == 2){
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