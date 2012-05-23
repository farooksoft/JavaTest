package com.casestudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConductTest {

	public static void main(String[] args) throws Exception {
		int correctAnswers=0;
		TestDAO quiz = new TestDAO();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Object[] objects= quiz.getQuestions();
		
		
		ArrayList qList = (ArrayList)objects[0];
		ArrayList optionList=(ArrayList)objects[1];
		int totalQuestion=qList.size();
		for (int i = 0; i < qList.size(); i++) {
			System.out.println(i+1+". "+qList.get(i));
			System.out.println(optionList.get(i));
			System.out.print("Enter Answer :");
			String answer = br.readLine();
			boolean isCorrect=quiz.checkAnswer(qList.get(i).toString(), answer);
			if(isCorrect){
				correctAnswers=correctAnswers+1;
			}
		}
		
		System.out.println("You have answered "+correctAnswers+" out of "+totalQuestion);

	}
}
