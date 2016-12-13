package br.com.algorithms.functions.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.algorithms.functions.Palindrome;

public class PalindromeTest {

	@Test
	public void test() {
		// Iterative Tests
		// True
		assertTrue(Palindrome.isPalindrome("eye"));
		assertTrue(Palindrome.isPalindrome("pop"));
		assertTrue(Palindrome.isPalindrome("rotator"));
		assertTrue(Palindrome.isPalindrome("kayak"));
		assertTrue(Palindrome.isPalindrome("1 # 2 # 33 # 2 # 1"));
		// False
		assertFalse(Palindrome.isPalindrome("eyt"));
		assertFalse(Palindrome.isPalindrome("aoo"));
		assertFalse(Palindrome.isPalindrome("rtator"));
		assertFalse(Palindrome.isPalindrome("kiyak"));
		assertFalse(Palindrome.isPalindrome("1 # 2 # 43 # 2 # 1"));

		// Recursive Tests
		// True
		assertTrue(Palindrome.isPalindromeRecursive("eye"));
		assertTrue(Palindrome.isPalindromeRecursive("pop"));
		assertTrue(Palindrome.isPalindromeRecursive("rotator"));
		assertTrue(Palindrome.isPalindromeRecursive("kayak"));
		assertTrue(Palindrome.isPalindromeRecursive("1 # 2 # 33 # 2 # 1"));
		// False
		assertFalse(Palindrome.isPalindromeRecursive("eyt"));
		assertFalse(Palindrome.isPalindromeRecursive("aoo"));
		assertFalse(Palindrome.isPalindromeRecursive("rtator"));
		assertFalse(Palindrome.isPalindromeRecursive("kiyak"));
		assertFalse(Palindrome.isPalindromeRecursive("1 # 2 # 43 # 2 # 1"));
	}

}
