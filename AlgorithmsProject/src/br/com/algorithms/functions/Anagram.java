package br.com.algorithms.functions;

import java.util.Arrays;

public class Anagram {
	
	public static boolean simpleAnagram(String word, String candidate) {
		if (word == null || candidate == null) {
			return false;
		} else if (word.length() != candidate.length()) {
			return false;
		} else {
			
			StringBuilder wordBuilder = new StringBuilder(word);
			StringBuilder candidateBuilder = new StringBuilder(candidate);
			
			for (int i = 0; i < wordBuilder.length(); ++i) {
				char nextChar = wordBuilder.charAt(i);
				boolean hasFound = false;
				for (int j = 0; j < candidateBuilder.length(); ++j) {
					if (candidateBuilder.charAt(j) == nextChar) {
						hasFound = true;
						candidateBuilder.deleteCharAt(j);
						break;
					}
				}
				
				if (!hasFound) {
					return false;
				}
			}
			
			return candidateBuilder.length() == 0;
		}
	}
	
	public static boolean sortAnagram(String word, String candidate) {
		if (word == null || candidate == null) {
			return false;
		} else if (word.length() != candidate.length()) {
			return false;
		} else {
			char[] wordArray = word.toCharArray();
			char[] candidateArray = candidate.toCharArray();
			Arrays.sort(wordArray);
			Arrays.sort(candidateArray);
			return new String(wordArray).equals(new String(candidateArray));
		}
	}

}
