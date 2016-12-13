package br.com.algorithms.sort.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.algorithms.sort.QuickSort;

public class QuickSortTest {

	@Test
	public void test() {

		int[] worstArray = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, -1 };
		int[] bestArray = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] someArray = new int[] { 1, 0, 8, -3, 40, 13, -1, 1 };
		
		QuickSort.sort(worstArray);
		QuickSort.sort(bestArray);
		QuickSort.sort(someArray);

		Assert.assertArrayEquals(new int[] { -1, 2, 3, 4, 5, 6, 7, 8, 9 }, worstArray);
		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, bestArray);
		Assert.assertArrayEquals(new int[] { -3, -1, 0, 1, 1, 8, 13, 40 }, someArray);
	}
}
