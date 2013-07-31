package Assign2;

/* Write an application that reads an English language phrase and encodes the phrase into Morse code. Also write a program that reads a phrase in Morse code and converts the phrase into the English language equivalent. Use one blank between each Morse coded letter and three blank spaces between each Morse coded word. */

import java.lang.Character.*;

import java.util.StringTokenizer;
class Morse
{
	char alpha[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
	String morse[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".--","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".---","..--","...--","....-","....","-....","--...","---..","----.","-----"};



	void convertToMorse(String s)
	{
			for(int j=0;j<s.length();j++)
			{
				if((Character.isWhitespace(s.charAt(j)))==true)
				System.out.print("   ");
			for(int k=0;k<alpha.length;k++)
			{
				if(s.charAt(j)==alpha[k])
				{
				System.out.print(morse[k]+" ");
				break;
				}

			}
			}

	}




	void convertToEnglish(String s)
	{
		StringTokenizer tokenizer=new StringTokenizer(s);
				String temp_str=new String();
				int j;
		while(tokenizer.hasMoreElements())
				{

						temp_str=tokenizer.nextToken();
						for(j=0;j<morse.length;j++)
						{
							if(temp_str.equals(morse[j]))
							{
							System.out.print(alpha[j]);
							break;
							}
						}

				}
	}

}




class MorseCode
{
	public static void main(String []args)
	{
	Morse mor=new Morse();
	mor.convertToMorse("HAI BY 12");
	System.out.println();
	mor.convertToEnglish(".... .- .. -... -.--");
	}
}




