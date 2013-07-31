package Assign1;

/* 13.	Write a program to create a rectangular array containing a multiplication table from 1X1 up to 12X12. Output the table as 13 columns with the numeric values right aligned in columns. (The first line of output will be the column headings, the first column with no heading, then the numbers 1 to 12 for the remaining columns. The first item in each of the succeeding lines is the row heading which ranges from 1 to 12). */

class Tables {
	int row, col, temp;

	void generateTables() {

		System.out.println("\tMULTIPLICATION TABLES\n");
		System.out.print("   \t");
		for (row = 1; row <= 8; row++)
			System.out.print(row + "\t");

		System.out.println("\n");
		for (row = 1; row <= 8; row++) {
			System.out.print(row + "\t");
			for (col = 1; col <= 8; col++) {
				System.out.print(row + "x" + col + "=" + row * col + "\t");
			}
			System.out.println("\n");
		}
	}
}

class MultiplicationTable {
	public static void main(String[] args) {
		Tables table = new Tables();
		table.generateTables();
	}
}
