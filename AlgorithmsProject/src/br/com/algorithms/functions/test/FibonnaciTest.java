package br.com.algorithms.functions.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.algorithms.functions.Fibonnaci;

public class FibonnaciTest {

	@Test
	public void test() {
		// Linear Fibonnaci
		assertEquals(0, Fibonnaci.fibonnaci(0));
		assertEquals(1, Fibonnaci.fibonnaci(1));
		assertEquals(1, Fibonnaci.fibonnaci(2));
		assertEquals(2, Fibonnaci.fibonnaci(3));
		assertEquals(3, Fibonnaci.fibonnaci(4));
		assertEquals(5, Fibonnaci.fibonnaci(5));
		assertEquals(8, Fibonnaci.fibonnaci(6));
		assertEquals(13, Fibonnaci.fibonnaci(7));
		assertEquals(21, Fibonnaci.fibonnaci(8));
		assertEquals(34, Fibonnaci.fibonnaci(9));
		assertEquals(55, Fibonnaci.fibonnaci(10));
		assertEquals(89, Fibonnaci.fibonnaci(11));
		assertEquals(144, Fibonnaci.fibonnaci(12));
		assertEquals(233, Fibonnaci.fibonnaci(13));
		assertEquals(377, Fibonnaci.fibonnaci(14));
		assertEquals(610, Fibonnaci.fibonnaci(15));
		assertEquals(987, Fibonnaci.fibonnaci(16));
		assertEquals(1597, Fibonnaci.fibonnaci(17));
		assertEquals(2584, Fibonnaci.fibonnaci(18));

		// Recursive Fibonnaci
		assertEquals(0, Fibonnaci.recursiveFibonnaci(0));
		assertEquals(1, Fibonnaci.recursiveFibonnaci(1));
		assertEquals(1, Fibonnaci.recursiveFibonnaci(2));
		assertEquals(2, Fibonnaci.recursiveFibonnaci(3));
		assertEquals(3, Fibonnaci.recursiveFibonnaci(4));
		assertEquals(5, Fibonnaci.recursiveFibonnaci(5));
		assertEquals(8, Fibonnaci.recursiveFibonnaci(6));
		assertEquals(13, Fibonnaci.recursiveFibonnaci(7));
		assertEquals(21, Fibonnaci.recursiveFibonnaci(8));
		assertEquals(34, Fibonnaci.recursiveFibonnaci(9));
		assertEquals(55, Fibonnaci.recursiveFibonnaci(10));
		assertEquals(89, Fibonnaci.recursiveFibonnaci(11));
		assertEquals(144, Fibonnaci.recursiveFibonnaci(12));
		assertEquals(233, Fibonnaci.recursiveFibonnaci(13));
		assertEquals(377, Fibonnaci.recursiveFibonnaci(14));
		assertEquals(610, Fibonnaci.recursiveFibonnaci(15));
		assertEquals(987, Fibonnaci.recursiveFibonnaci(16));
		assertEquals(1597, Fibonnaci.recursiveFibonnaci(17));
		assertEquals(2584, Fibonnaci.recursiveFibonnaci(18));
		
		// Dynamic Fibonnaci
		assertEquals(0, Fibonnaci.dynamicFibonnaci(0));
		assertEquals(1, Fibonnaci.dynamicFibonnaci(1));
		assertEquals(1, Fibonnaci.dynamicFibonnaci(2));
		assertEquals(2, Fibonnaci.dynamicFibonnaci(3));
		assertEquals(3, Fibonnaci.dynamicFibonnaci(4));
		assertEquals(5, Fibonnaci.dynamicFibonnaci(5));
		assertEquals(8, Fibonnaci.dynamicFibonnaci(6));
		assertEquals(13, Fibonnaci.dynamicFibonnaci(7));
		assertEquals(21, Fibonnaci.dynamicFibonnaci(8));
		assertEquals(34, Fibonnaci.dynamicFibonnaci(9));
		assertEquals(55, Fibonnaci.dynamicFibonnaci(10));
		assertEquals(89, Fibonnaci.dynamicFibonnaci(11));
		assertEquals(144, Fibonnaci.dynamicFibonnaci(12));
		assertEquals(233, Fibonnaci.dynamicFibonnaci(13));
		assertEquals(377, Fibonnaci.dynamicFibonnaci(14));
		assertEquals(610, Fibonnaci.dynamicFibonnaci(15));
		assertEquals(987, Fibonnaci.dynamicFibonnaci(16));
		assertEquals(1597, Fibonnaci.dynamicFibonnaci(17));
		assertEquals(2584, Fibonnaci.dynamicFibonnaci(18));
	}

}
