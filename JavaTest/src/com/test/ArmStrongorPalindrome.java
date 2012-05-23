package com.test;

public class ArmStrongorPalindrome {
	 public static void main(String args[]){
	      int num = Integer.parseInt(args[0]);
	      int n = num; //use to check at last time
	      int check=0;
	      int reverse=0;
	      int remainder,rem;

	      while(num > 0){
	           remainder = num % 10;
	           check = check + (int)Math.pow(remainder,3);
	           num = num / 10;
	      }
	      if(check == n)
	            System.out.println(n+" is an Armstrong Number");
	      else
	            System.out.println(n+" is not a Armstrong Number");
      
	      while(num > 0){
              rem = num % 10;
              reverse = reverse * 10 + rem;
              num = num / 10;
         }

        if(reverse == n)
            System.out.println(n+" is a Palindrome Number");
        else
            System.out.println(n+" is not a Palindrome Number");
	 }
}



