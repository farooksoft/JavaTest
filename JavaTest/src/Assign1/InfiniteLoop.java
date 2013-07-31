package Assign1;

/*3.	Write an application that keeps displaying in the command window the multiples of integer 2,(i.e. 2,4,6,8,10…..).Your loop should not terminate (create an infinite loop). What happens when you run this program? */

class GenerateLoop {

	// count variable is used to count the number of times the loop gets
	// iterated
	int i, count = 1;

	void generateMultiples() {

		for (i = 2;; i = i * 2, count++) {
			// try is a block which holds the error statements
			try {
				System.out.print(i + "  ");

				// sleep is a method of thread class which is used to provide
				// the time interval between each loop execution.
				Thread.sleep(500); // it provides interval in millisecounds.
			}

			// catch block is used to catch the exception whih is thrown by try
			// block in the form of exception class object.
			catch (InterruptedException ie) {
			}
		}
	}
}

class InfiniteLoop {
	public static void main(String[] args) {
		// loop is a object of GenerateLoop class
		GenerateLoop loop = new GenerateLoop();

		// calling the GenerateLoop class method using object.
		loop.generateMultiples();
	}
}

/*
 * the for loop iterates for 30 times by displaying +ve values. It displays a
 * negative value (-2147483648) in the 31st iteration and then from 32nd
 * iteration it starts displaying 0's creating an infinite loop
 */