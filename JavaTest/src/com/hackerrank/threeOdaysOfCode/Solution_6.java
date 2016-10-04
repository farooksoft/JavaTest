package com.hackerrank.threeOdaysOfCode;

public class Solution_6 {
	
	private static int[] elements = {1,2,5};
	public static int maximumDifference; 
	
	public static void main(String[] args) {
		computeDifference();
		System.out.println(maximumDifference);
	}
	
	static void computeDifference(){
        int small = 999999999; int big = 0;
        for(int i=0; i<elements.length; i++){
            if( elements[i] < small ){
                small = elements[i];
            }
            if(big < elements[i]){
                big = elements[i];
            }
        }
        System.out.println("big:"+ big +",small:"+ small);
        maximumDifference = big - small;
    }
	
}
