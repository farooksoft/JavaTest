package com.puzzles;

import java.util.Scanner;

public class Solution {
	/* Head ends here */
	static void displayPathtoPrincess(int n, String[] grid) {

	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m;
		m = in.nextInt();
		String grid[] = new String[m];
		for (int i = 0; i < m; i++) {
			grid[i] = in.next();
		}

		displayPathtoPrincess(m, grid);
	}
}