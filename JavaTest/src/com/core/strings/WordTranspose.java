package com.core.strings;

/* 8.	Write an application that transposes words in a given sentence. For example, given the sentence
 The gate to Java is here
 The method outputs

 Eht etag ot avaj si  ereh

 To simplify the problem, you may assume the input sentence contains no punctuation marks. You may also assume that the input sentence starts with a non blank character and there is exactly one blank space between the words. */

import java.util.StringTokenizer;

class Sort {
	String str = new String("The gate to Java is here");
	StringTokenizer tokenizer;
	String temp_str[], str1, str2;

	int words, i, j;

	void transposeWord() {
		tokenizer = new StringTokenizer(str);
		words = tokenizer.countTokens();
		temp_str = new String[words];

		str2 = new String(" ");
		i = 0;
		while (tokenizer.hasMoreElements()) {
			str1 = new String(" ");
			temp_str[i] = tokenizer.nextToken();
			for (j = temp_str[i].length() - 1; j >= 0; j--)
				str1 = str1 + temp_str[i].charAt(j);

			str2 = str2 + " " + str1;
			i++;

		}

	}

	void display() {

		System.out.println(str2);

	}
}

class WordTranspose {
	public static void main(String[] v) {
		Sort s = new Sort();
		s.transposeWord();
		s.display();
	}
}
