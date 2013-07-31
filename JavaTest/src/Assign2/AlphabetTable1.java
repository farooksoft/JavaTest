package Assign2;

/* 9.	Write an application that reads several lines of text from the keyboard and prints a table indicating the number of occurrences of each letter of the alphabet in the text. For example, the phrase

To be, or not to be: that is the question:

 Contains one “a”, two “b’s,” etc. */

 class Alphabets
 {
	 String line_of_text="welcome to the world of computers aaaaaaaaaaaa bbbbbbbbbb";
	 char alphas[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	 String nos[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
	 String nos1[]={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	 String nos2[]={"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	 int counts[]=new int[26];


	 void countLetters()
	 {


		 for(int i=0;i<line_of_text.length();i++)
		 {
			 for(int j=0;j<alphas.length;j++)
			 	{	 if(line_of_text.charAt(i)==alphas[j])
			     		counts[j]++;
				}
	 	  }
 	}


 	void display()
 	{
		int quot;
		for(int i=0;i<alphas.length;i++)    //main loop starts
		{

			//checks for values between 0 and 9 both inclusive

			if(counts[i]<10)
			{
				for(int j=0;j<10;j++)
				{
					if(counts[i]==j)
					{
					System.out.println(nos[j]+"\t"+alphas[i]+"'s");
					break;
					}
				}
			}

			//checks for values between 11 and 19 both inclusive

			if(counts[i]>10 && counts[i]<20)
			{
				for(int j=11,k=0;j<20;j++,k++)
				{
					if(counts[i]==j)
					{
					System.out.println(nos1[k]+"\t"+alphas[i]+"'s");
					break;
					}
				}
			}


			//checks for values multiples of 10

			for(int m=10;m<90;m=m+10)
			{
				if(counts[i]>0 && counts[i]%10==0)
				{
					quot=counts[i]/10;
					System.out.println(nos2[quot-1]+"\t"+alphas[i]+"'s");
					break;
				}
			}
	}

	//	System.out.println("No.of "+alphas[i]+"'s"+" = "+counts[i]);

/*		for(int i=0;i<alphas.length;i++)
		System.out.println("No.of "+alphas[i]+"'s"+" = "+counts[i]); */
	}
}

class AlphabetTable1
{
	public static void main(String []args)
	{
		Alphabets al=new Alphabets();
		al.countLetters();
		al.display();
	}
}







