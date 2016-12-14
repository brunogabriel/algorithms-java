package br.com.algorithms.search.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.algorithms.search.BinarySearch;

public class BinarySearchTest {

	@Test
	public void test() {
		
		// Iterative Search
		for (int i = 0; i <= 10; ++i) {
			assertEquals(i, BinarySearch.binarySearch(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, i));
			assertNotEquals(13, BinarySearch.binarySearch(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, i));
		}

		assertEquals(-1, BinarySearch.binarySearch(new int[] { 0, 1, 2, 4 }, 3));
		
		// Recursive Search
		for (int i = 0; i <= 10; ++i) {
			assertEquals(i, BinarySearch.recursiveBinarySearch(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 0, 10, i));
			assertNotEquals(13, BinarySearch.recursiveBinarySearch(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 0, 10, i));
		}

		assertEquals(-1, BinarySearch.recursiveBinarySearch(new int[] { 0, 1, 2, 4 }, 0, 3, 3));
	}

}
