package com.test.casestudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AddQuestions {
	
	public static void main(String[] args) throws Exception {
		  
		  String input="Y";
		  TestDAO quiz=new TestDAO();
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  
		  while(input.equalsIgnoreCase("Y")==true){
			  System.out.println("Enter the Question");
			  String question=br.readLine();
			  System.out.println("Enter option 1:");
			  String option1=br.readLine();
			  System.out.println("Enter option 2:");
			  String option2=br.readLine();
			  System.out.println("Enter option 3:");
			  String option3=br.readLine();
			  System.out.println("Enter option 4:");
			  String option4=br.readLine();
			  System.out.println("Enter Answer( a-option1 or b-option2 or c-option3 or d-option4:");
			  String answer=br.readLine();
			  quiz.insertQuestions(question, answer,option1,option2,option3,option4);
			  System.out.println("Press Y/N to continue");
			  input=br.readLine();
		  }
	}
}
