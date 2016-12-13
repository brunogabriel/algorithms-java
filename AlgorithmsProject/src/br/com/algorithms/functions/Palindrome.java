package br.com.algorithms.functions;

public class Palindrome {

	public static boolean isPalindrome(String word) {
		if (word == null) {
			throw new RuntimeException("Fail to call is palindrome, invalid parameter, should be different from null");
		}

		for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
		}

		return true;
	}

	public static boolean isPalindromeRecursive(String word) {
		return isPalindromeRecursiveMethod(word, 0, word.length() - 1);
	}

	private static boolean isPalindromeRecursiveMethod(String word, int start, int end) {
		if (word == null) {
			throw new RuntimeException("Fail to call is palindrome, invalid parameter, should be different from null");
		} else if (start < end) {
			if (word.charAt(start) != word.charAt(end)) {
				return false;
			} else {
				return isPalindromeRecursiveMethod(word, start + 1, end -1);
			}
		} else
			return true;
	}

}
