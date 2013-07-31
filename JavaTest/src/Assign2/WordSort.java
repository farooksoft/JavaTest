package Assign2;

/* 16.	Write a program that sets up a String variable containing a paragraph of text of your choice. Extract the words from the text and sort them into alphabetical order. Display the sorted list of words. You could use simple sorting method called the bubble sort. To sort an array into ascending order the process is as follows.

i.	Starting with the first element in the array compare successive elements (0 and 1, 1 and 2, 2and 3 and so on)
ii.	If the first element of any pair is greater than the second interchange the two elements.
iii.	Repeat the process for the whole array until no interchanges are necessary. The array elements will be now in ascending order.  */


//StringTokenizer is a class available in util package, which consists of countTokens and hasMoreElements methods to seperate the given string.

import java.util.StringTokenizer;

//class is a user defined datatype
class SortOne
{

	//str is a string variable.
	String str="this is a book";

	//tokenizer is a StringTokenizer object.
	StringTokenizer tokenizer;

	// temp_str is a string array and temp is a string varaible which is initialsied as null
	String temp_str[],temp=null;

	//words is a int variable.
	int words;

// wordSort is a method which consists of hasMoreElements to seperate the given string
	void wordSort()
	{
		//tokenizer is pointing to the "this is a book" string.
	tokenizer=new StringTokenizer(str);

	// counting the total number of words within the given string and storing it in words variable
	words = tokenizer.countTokens();

	//puting that total number of words inside the array variable temp_str.
		temp_str=new String[words];

		// arranging the letters / names in alphabetical order using hasMoreElements and nextToken methods.
		while(tokenizer.hasMoreElements())
		{
			for(int i=0;i<words;i++)
				temp_str[i]=tokenizer.nextToken();
		}
				for(int i=0;i<words;i++)
				{

					// comparing between both the words. if it is greater than zero then arranges those words in alphabetical order.
					for(int j=i+1;j<words;j++)
					{
						if((temp_str[i].compareTo(temp_str[j]))>0)
						{
						 temp=temp_str[i];
						 temp_str[i]=temp_str[j];
						 temp_str[j]=temp;
						}
					}
				}

	}

// displaying the sorted words based on looping.
void display()
	{
		for(int i=0;i<words;i++)
		System.out.println(temp_str[i]);

	}
}

//WordSort is a class which consists of main method.
class WordSort
{
	public static void main(String []v)
	{
		//creating an instance for the Sort class.
		SortOne s=new SortOne();

		//calling the Sort method using s object.
		s.wordSort();
		s.display();
	}
}


