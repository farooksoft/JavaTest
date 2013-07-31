package Assign1;

/* Write an application that inputs an amount to be printed on a check, and then prints the amount in check – protection format with leading asterisks if necessary. Assume that nine spaces are available for printing the amount. */

class Amount {
	// amount , str , s1, s , spaces are the variables of type float, string and
	// integer
	Float amount;
	String str, s, s1;
	int spaces;

	// its an constructor which consists of parameters to the amount from the
	// object and assign it to the current class vaiable.
	Amount(float amount) {
		// this is a keyword which is used to refer to the current running class
		// variable.
		// Note:- when we use same name for parameters and instance variable. To
		// represent the current class variable we use "this" keyword.
		this.amount = amount;
	}

	// split is a method which accepts the amount and converts it to the integer
	// format.
	void split() {
		str = Float.toString(amount);

		// to find the length of the amount we use length() method. the result
		// is stored inside the spaces variable.
		spaces = 9 - str.length();
	}

	// printStars is a method which is used to insert the "*" charcters based on
	// the length of the amount we have accepted.
	void printStars(int sp) {
		int i;
		for (i = 1; i <= sp; i++)
			System.out.print("*");
	}

	// display is a method which is used to output the original amount and the
	// altered amount.
	void display() {
		System.out.println("Given amount = " + amount);
		System.out.print("\nCheque Amount : ");
		printStars(spaces);
		System.out.print(amount + "\n\n");
	}

}

// CheckAmount is a class which consists of main method
class CheckAmount {
	public static void main(String[] args) {
		// amt is an Amount class object which is passing the amount within the
		// parameters
		Amount amt = new Amount(123.25f);

		// calling the class methods using the object
		amt.split();
		amt.display();
	}
}