package Assign2;

/* 2.	Write an application that accepts the unit weight of a bag of coffee in pounds and
the number of bags sold and displays the total price of the sale, computed as

		total price = unitweight * number of units * INR 25;
		total price with tax = total price + totalprice * INR 0.70,
where 25 is the cost per 200grams and 0.70 is the sales tax. Use data type of float. */


import java.io.*;

class Bag
{
	float total_price_tax,unit_weight,no_of_bags,total_price;

	BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));


	void calcPrice()
	{

		try
		{
			System.out.println("enter the unit weight of bag[in pounds]   ");

			unit_weight =Float.parseFloat(br.readLine());

			System.out.println("number of bags to be sold?  ");

			no_of_bags=Float.parseFloat(br.readLine());

			total_price = (unit_weight *220)* no_of_bags * 25;

			total_price_tax = total_price + total_price * 0.70F;


		}
		catch(IOException ioe)
		{	}               /* CHECK THE PROGRAM */
	}

	void display()
	{
		System.out.println("TOTAL PRICE Rs. " + total_price);

		System.out.println("TOTAL PRICE WITH TAX  " + total_price_tax);
	}
}

class CoffeeBag
{
	public static void main(String []arg)
	{
		Bag  bag = new Bag();

		bag.calcPrice();
		bag.display();
	}
}

