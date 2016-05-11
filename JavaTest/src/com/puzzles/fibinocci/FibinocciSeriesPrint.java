package com.puzzles.fibinocci;

/**
 * Print Fibinocci series example with sample loop
 * 
 * 0 1 1 2 3 5 8 13 21 34 55 
 * 
 * @author srayabar
 *
 */
public class FibinocciSeriesPrint {
	
	public static void main(String[] args) {
		for(int i=0; i<15; i++)
		System.out.print(printFibinocciSeries(i)+" ");		
	}

	private static int printFibinocciSeries(int num) {
		
		if(num ==0){
			return 0;
		}
		
		if(num == 1 || num == 2){
			return 1;
		}
		
		int temp1=1, temp2=1, fibinocci=0;		
		for(int i=3; i<=num; i++){
			fibinocci = temp1+temp2;			
			temp1 = temp2;
			temp2 = fibinocci;
		}
		return fibinocci;
	}
	
}
