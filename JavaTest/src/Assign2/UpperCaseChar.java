package Assign2;


/* 5.	Write a method that returns the number of uppercase letters in a string object passed to a method as a parameter. Use the class method isUpperCase( ) of the Character class, which returns true if the passed parameter of type char is an uppercase letter. You need explore the Character class from the java.lang package on your own. */


//static imports are used to avoid using the class name at the static method call
//NOTE: static imports will work only on jdk1.5 or above

import static java.lang.Character.*;

//class Count has the method that takes String object as a parameter and returns the no.of uppercase character from the given string
class Count{

    //counter variable is used to store the no.of uppercase letter found in the string

	int counter=0;

	//checkUpperCase is a method that accepts the string object as a parameter and returns the total no.of uppercase character within the string

	int checkUpperCase(String str){

	//str.length() method returns the length of the string
	//variable i is used for iterations.
	//for every iteration it takes a single character from the string and checks for the uppercase character.

	//charAt() method returns a character at specified position

	//isUpperCase() method returns a boolean if the character is in uppercase

	for(int i=0;i<str.length();i++){
	if((isUpperCase(str.charAt(i)))==true)
	counter++;             //counter gets incremented every time the condition becomes true
} //end of for loop
return counter;          //returns the counter value to the calling method
}//end of method
}//end of class


//UpperCaseChar class has the main method

class UpperCaseChar{
	public static void main(String []args){
   //creating an instance of the Count class
		Count c=new Count();
//creating and initializing the string object str_obj

		String str_obj="Hello WELCOME to Java World!";

		System.out.println("Given String is :  "+str_obj);

//num_of_chars variable is used to get the no.of characters in uppercase returned by the Count class method

		//calling the checkUpperCase() method by passing the string object
		int num_of_chars=c.checkUpperCase(str_obj);

		System.out.println("No. of Uppercase letters : "+num_of_chars);
	}  //end of main method
}//end of the class


