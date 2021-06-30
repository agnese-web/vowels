package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {


	String sentence = "My name is Agnese, I am learning Java.";
	sentence = sentence.toLowerCase(Locale.ROOT);
	char[] letters = sentence.toCharArray();
	int vowels = 0;
	for(int i = 0; i < sentence.length(); i++) {
		if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i'
				|| sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
			vowels++;
		}
	}
		System.out.println("This sentence '" +  sentence + "' contains " + vowels + " vowels");
    }

}
