package com.puzzles;

import java.util.ArrayList;
import java.util.List;

/**
 * class to test anagrams in list of strings
 * 
 * @author srayabar
 *
 */
public class AnagramStringMain {

	public static void main(String[] args) {
		
		//System.out.println(isAnagram("abcxyz", "xzybca"));
		
		List<String> stringsList = new ArrayList<String>();
		stringsList.add("bca");
		stringsList.add("abc");
		stringsList.add("abd");
		stringsList.add("ab");
		stringsList.add("ba");
		stringsList.add("ac");
		stringsList.add("ca");
		
		checkAnagrams(stringsList);
	}
	
	private static void checkAnagrams(List<String> stringsList) {
		int counter = 0;
		for(int i=0; i< stringsList.size(); i++){
			
			for(int j=i+1; j< stringsList.size(); j++){
				
				if(isAnagram(stringsList.get(i), stringsList.get(j))){
					counter ++;
				}
			}
		}
		System.out.println(counter);
	}

	/*
     * One way to find if two Strings are anagram in Java. This method
     * assumes both arguments are not null and in lowercase.
     *
     * @return true, if both String are anagram
     */
    public static boolean isAnagram(String word, String anagram){
    	
        if(word.length() != anagram.length()){
            return false;
        }

        char[] chars = word.toCharArray();
       
        for(char c : chars){
        	//System.out.println(c);
            int index = anagram.indexOf(c);
            if(index != -1){
            	//System.out.println(anagram);
            	anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
            }else{
                return false;
            }
        }
       
        return anagram.isEmpty();
    }
}
