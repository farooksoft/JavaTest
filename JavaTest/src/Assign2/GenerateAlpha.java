package Assign2;

/*14.	Write a program to generate a random sequence of capital letters
						that does not include vowels. */


//Generate is a class which consits of generateAlpha method
class GenerateOne
{

	//Generate is a default contructor which is used to initialise the value for the members

	GenerateOne()
	{
	}

// generateAlpha method is used to generate the ramdom capital alphabets except vowels

	void generateAlpha()
	{
		// alpha is a character variable

		char alpha;

		// loop that traverses from A through Z leaving out the vowels

		for(alpha='A';alpha<='Z';alpha++)
		{

			//checks for vowels, if it matches then continues with the looping part

			if(alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U')

			  continue;
			System.out.print("    "+alpha);
		}
	}
}

//GenarteAlpha is a class which consists of main method.

class GenerateAlpha
{
	public static void main(String []args)
	{
		// cretaing the instance of the class Generate

		GenerateOne gen=new GenerateOne();

		// accessing the method of generate class using Generate object gen

		gen.generateAlpha();
	}
}


