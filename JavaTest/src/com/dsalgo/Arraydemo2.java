package com.dsalgo;

public class Arraydemo2 {
	public static void main(String[] args) {
		int[] a[] = new int[2][3];
		a[0][0] = 100;
		a[0][1] = 100;
		a[0][2] = 100;
		a[1][0] = 100;
		a[1][1] = 100;
		a[1][2] = 100;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t ");
			}
			System.out.println();
		}

	}
}
