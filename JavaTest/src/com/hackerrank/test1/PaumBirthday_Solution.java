package com.hackerrank.test1;

import java.util.Scanner;

public class PaumBirthday_Solution {
	
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		if(inputScanner.hasNext()){
			long numberOfInputs = inputScanner.nextLong();
			
			for(int i=0;i<numberOfInputs; i++){

				long black = inputScanner.nextLong();
				long white = inputScanner.nextLong();
				long blackNumber = inputScanner.nextLong();
				long whiteNumber = inputScanner.nextLong();
				long conversionNumber = inputScanner.nextLong();
				
				long firstTotal = (black * blackNumber) + (white * whiteNumber);
				
				long secondTotal = 0;
				if(blackNumber < whiteNumber){
					secondTotal = (black * blackNumber) + ((white * blackNumber)+(white * conversionNumber));
				} else if(blackNumber > whiteNumber){
					secondTotal = (white * whiteNumber) + ((black * whiteNumber)+(black * conversionNumber));
				}else{
					secondTotal = (white * whiteNumber) + (black * blackNumber);
				}
				
				if(firstTotal >= secondTotal){
					System.out.println(secondTotal);
				}else {
					System.out.println(firstTotal);
				}
				
			}
		}
		
		inputScanner.close();
	}

}