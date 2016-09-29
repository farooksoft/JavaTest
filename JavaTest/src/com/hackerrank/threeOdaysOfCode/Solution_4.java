package com.hackerrank.threeOdaysOfCode;

import java.util.Scanner;

public class Solution_4 {
	
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
        int n = in.nextInt();*/
		int n = 65535;
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        int counter = 0; int value = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                counter ++;
            } else {
                if(value < counter){
                    value = counter;
                }
                counter = 0;
            }
        }
        
        System.out.println((value < counter) ? counter : value);
	}
	
}