package Assign1;

/* 5.	Use a single subscripted array to solve the following problem. Read in 20 numbers, each which is between 10 and 100, inclusive. As each number is read, print it only if it is not a duplicate of a number already read. Provide for the “worst” case in which all 20 numbers are different. Use the smallest possible way to solve the problem. */

import java.io.*;

class SubscriptArray {
	public static void main(String[] args) {
		int[] arr = new int[6];
		int arr1[] = new int[6];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 20 numbers between 10 and 100  ");
		try {
			for (int i = 0; i < 5; i++)

				arr[i] = Integer.parseInt(br.readLine());
			arr1 = arr;
		} catch (Exception e) {
		}

		for (int i = 0; i < 5; i++) {
			if (arr[i] == arr1[i])
				continue;
			System.out.println(arr[i]);
		}

	}
}

/************** INCOMPLETE PROGRAMME *************/
