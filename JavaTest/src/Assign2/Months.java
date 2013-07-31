package Assign2;

/* 15.	Create an array of String variables and initialize the array with the names of the months from January to December. Create and array containing 12 random decimal values between 0.0 and 100.0. Display the names of each month along with the corresponding decimal value. Calculate and display the average of the 12 decimal values  */

class Generate
{
	String []months={"January","February","March","April","May","June","July","August","September","October","November","December"};
	double []rand_numbers=new double[12];
	double sum=0.0,average;

	void createNos()
	{
		for(int i=0;i<12;i++)
		{
		rand_numbers[i]=0.0+(100.0*Math.random());
		sum=sum+rand_numbers[i];
		}
		average=sum/12;
	}
	void display()
	{
		for(int i=0;i<12;i++)
		{
			System.out.println(months[i]+"  ******  "+rand_numbers[i]);
		}
		System.out.println("\n\nAverage :  "+average);
	}
}

class Months
{
	public static void main(String []args)
	{
		Generate gen=new Generate();
		gen.createNos();
		gen.display();
	}
}
