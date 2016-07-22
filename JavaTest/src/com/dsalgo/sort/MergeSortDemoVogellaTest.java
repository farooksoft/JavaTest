package com.dsalgo.sort;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class MergeSortDemoVogellaTest {
	
	private int[] numbers;
	private final static int SIZE = 7;
	private final static int MAX = 20;
	
	//stubbing with random integer data
	@Before
	public void setUp() throws Exception{
		numbers = new int[SIZE];
		Random random = new Random();
		System.out.println("Input order : ");
		for(int i=0; i<numbers.length; i++){
			numbers[i] = random.nextInt(MAX);
			System.out.print(numbers[i] +", ");
		}
	}
	
	@Test
	public void testMergeSort(){
		long startTime = System.currentTimeMillis();
		
		MergeSortDemoVogella sortDemo = new MergeSortDemoVogella();
		sortDemo.sort(numbers);
		
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		
		System.out.println("\nMerge Sort completed in secs- " + elapsedTime);
		System.out.println("Output order : ");
		
		for(int i=0; i<numbers.length-1; i++){
			System.out.print(numbers[i]+", ");
			if(numbers[i] > numbers[i+1]){
				fail("Should not happen! - " + numbers[i] + ">" + numbers[i+1]);
			}
		}
		assertTrue(true);
	}

	/*@Test
	public void itWorksRepeatably(){
		
	}
	
	@Test
	public void testStandardSort(){
		
	}*/
}
