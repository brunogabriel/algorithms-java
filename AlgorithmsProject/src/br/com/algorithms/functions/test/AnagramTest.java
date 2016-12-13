package br.com.algorithms.functions.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.algorithms.functions.Anagram;

public class AnagramTest {

	@Test
	public void test() {
		// Simple Anagram
		// True
		assertTrue(Anagram.simpleAnagram("abc", "bac"));
		assertTrue(Anagram.simpleAnagram("bba", "abb"));
		assertTrue(Anagram.simpleAnagram("aspired", "despair"));
		assertTrue(Anagram.simpleAnagram("aster", "tears"));
		assertTrue(Anagram.simpleAnagram("bores", "robes"));
		assertTrue(Anagram.simpleAnagram("skate", "stake"));
		assertTrue(Anagram.simpleAnagram("skate", "steak"));
		
		// False
		assertFalse(Anagram.simpleAnagram("abc", "bbc"));
		assertFalse(Anagram.simpleAnagram("bba", "bbac"));
		assertFalse(Anagram.simpleAnagram("aspired", "daspar"));

		// Sort Anagram
		assertTrue(Anagram.sortAnagram("abc", "bac"));
		assertTrue(Anagram.sortAnagram("bba", "abb"));
		assertTrue(Anagram.sortAnagram("aspired", "despair"));
		assertTrue(Anagram.sortAnagram("aster", "tears"));
		assertTrue(Anagram.sortAnagram("bores", "robes"));
		assertTrue(Anagram.sortAnagram("skate", "stake"));
		assertTrue(Anagram.sortAnagram("skate", "steak"));
		
		// False
		assertFalse(Anagram.sortAnagram("abc", "bbc"));
		assertFalse(Anagram.sortAnagram("bba", "bbac"));
		assertFalse(Anagram.sortAnagram("aspired", "daspar"));
	}

}
