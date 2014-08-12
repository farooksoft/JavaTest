package com.core.strings;

/* 17.	Write an application that uses random number generation to create sentences. Use four arrays of strings called Article, Noun, Verb and Preposition. Create a sentence by selecting a word at random from each array in the following order: Article, Noun, Verb, Preposition, Article and Noun. As each word is picked concatenate it to the previous words in the sentence. The words should be separated by spaces. When the final sentence is output, it should start with capital letter and end with a full stop. The program should generate 20 sentences and output them to a text area. The arrays should be filled as follows: The article array should contain the articles “the”, “a|”,  “One”, “some|”; the Noun array should contain the nouns “boy”, “girl”, “dog”, “town”, and “car|”; the Verb array should contain the verbs “drove”, “Jumped”, “ran”, “walked”, and “skipped”;, the preposition array should contain the prepositions “to”, “from”, “over”, “under”, and “on”. */

import java.lang.Math;
import java.lang.Character;

class CreateSentences {
	String[] article = { "the", "a", "one", "some" };
	String[] noun = { "boy", "girl", "dog", "town", "car" };
	String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
	String[] prepo = { "to", "from", "over", "under", "on" };
	int a_index, n_index, v_index, p_index, j;
	String[] s = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "" };

	void formSentences() {

		for (int i = 0; i < 25; i++) {
			a_index = 0 + (int) (3 * Math.random());
			n_index = 0 + (int) (4 * Math.random());
			v_index = 0 + (int) (4 * Math.random());
			p_index = 0 + (int) (4 * Math.random());

			s[i] = s[i] + article[a_index];
			s[i] = s[i] + " " + noun[n_index];
			s[i] = s[i] + " " + verb[v_index];
			s[i] = s[i] + " " + prepo[p_index];

			a_index = 0 + (int) (3 * Math.random());
			n_index = 0 + (int) (4 * Math.random());

			s[i] = s[i] + " " + article[a_index];
			s[i] = s[i] + " " + noun[n_index];
		}
	}

	void showSentences() {
		for (int i = 0; i < 25; i++) {
			System.out.print(Character.toUpperCase(s[i].charAt(0)));
			for (int j = 1; j < s[i].length(); j++)
				System.out.print(s[i].charAt(j));
			System.out.println(".");
		}
	}
}

class RandomSentence {
	public static void main(String[] ar) {
		CreateSentences arrays = new CreateSentences();
		arrays.formSentences();
		arrays.showSentences();
	}
}
