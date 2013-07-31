package Assign1;

/* EXTRA PROGRAM : to display perfect nos.[like 6 = 1+2+3 (factors of 6)] upto 1000 */

class PerfectNos {
	public static void main(String[] args) {
		int i, j, num1, num2, sum;

		for (i = 2; i <= 1000; i++) {
			sum = 0;
			num1 = i;

			for (j = 1; j < num1; j++) {
				if (i % j == 0)
					sum = sum + j;
			}
			if (sum == num1) {
				System.out.print("     " + i);
			}
		}
	}
}
