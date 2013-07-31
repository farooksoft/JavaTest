package Assign1;

/* 18.	Write a program to create a class Savings Account. Use a static class variable to store the annualinterestRate for all the account holders. Each object of the class contains a private instance variable Savings Balance indicating the amount the saver currently has on deposit. Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the savings balance by annualinterestrate divided by 12; this interest should be added to savings balance. Provide a static method modifyinterestRate that sets the annualinterestRate to a new value. Write a program to test this by instantiating two savings Account objects Saver1 and Saver 2 with balances of Rs 2000 and Rs 3000 respectively. Set annualInterestRate to 4%, then calculate the monthly interest and print the new balances for each of the savers. Then set the annualInterestRate to 5% and calculate the next month’s interest and print the new balances for each of the savers.  */

class SavingsAccount {
	// annual_int_rate is a float varaiable which is decalred as static
	static float annual_int_rate;

	// savings_bal is a float variable,that is decalred as private to be
	// accessed only within the same class
	private float savings_bal;

	// interest is a float variable
	float interest;

	// SavingsAccount is a method which consists of float parameter that accepts
	// the sav_bal and initialises to the current class varaiable i,e
	// savings_bal.

	SavingsAccount(float sav_bal) {
		savings_bal = sav_bal;
	}

	// calcMonthlyInterest is a method which is used to calculate the interest
	// and savings_bal based on the accepted sav_bal and interest rate.

	void calcMonthlyInterest() {
		interest = (savings_bal * modifyInterestRate(annual_int_rate)) / 12.0f;
		savings_bal += interest;

		System.out.println("Interest  :  " + interest);
		System.out.println("Savings Balance : " + savings_bal);
	}

	// modifyInterestRate is a static method which is used to accept the
	// new_rate and calaculate the annual interest and return the value to the
	// main method.

	static float modifyInterestRate(float new_rate) {
		annual_int_rate = new_rate;
		return annual_int_rate;
	}

}

// BankAccount is a class which consists of main method
class BankAccount {
	public static void main(String[] args) {
		// saver1 is a object of SavingsAccount class which passes 2000.0f value
		// within the constructor
		SavingsAccount saver1 = new SavingsAccount(2000.0f);

		// calling the methods by passing the parameters value to SavingsAccount
		// class using the object
		saver1.modifyInterestRate(4.0f);
		saver1.calcMonthlyInterest();

		// saver2 is an another object of same class which passes 3000.0f value
		// within the construtor
		SavingsAccount saver2 = new SavingsAccount(3000.0f);

		// calling the methods by pasing parameters by using the object saver2
		saver2.modifyInterestRate(5.0f);
		saver2.calcMonthlyInterest();
	}
}
