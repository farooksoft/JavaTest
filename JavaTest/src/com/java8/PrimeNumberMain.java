package com.java8;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumberMain {
	public static void main(String[] args) {
		
		System.out.println(isPrime(4));
		System.out.println(isPrime(5));
	}
	
	//Declarative style of programming
	private static boolean isPrime(int number) {
		
		// without predicate
		//return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0 );
		
		//with predicate
		IntPredicate isDivisible = divisor -> number % divisor == 0;		
		return number > 1 && IntStream.range(2, number).noneMatch(isDivisible);
		
	}
}