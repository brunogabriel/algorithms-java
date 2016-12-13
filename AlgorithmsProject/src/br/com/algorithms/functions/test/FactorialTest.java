package br.com.algorithms.functions.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.algorithms.functions.Factorial;

public class FactorialTest {

	@Test
	public void test() {
		// Linear Factorial
		assertEquals(1, Factorial.factorial(0));
		assertEquals(1, Factorial.factorial(1));
		assertEquals(2, Factorial.factorial(2));
		assertEquals(6, Factorial.factorial(3));
		assertEquals(24, Factorial.factorial(4));
		assertEquals(120, Factorial.factorial(5));
		assertEquals(720, Factorial.factorial(6));
		assertEquals(5040, Factorial.factorial(7));
		assertEquals(40320, Factorial.factorial(8));
		assertEquals(362880, Factorial.factorial(9));
		assertEquals(3628800, Factorial.factorial(10));

		// Recursive Factorial
		assertEquals(1, Factorial.recursiveFactorial(0));
		assertEquals(1, Factorial.recursiveFactorial(1));
		assertEquals(2, Factorial.recursiveFactorial(2));
		assertEquals(6, Factorial.recursiveFactorial(3));
		assertEquals(24, Factorial.recursiveFactorial(4));
		assertEquals(120, Factorial.recursiveFactorial(5));
		assertEquals(720, Factorial.recursiveFactorial(6));
		assertEquals(5040, Factorial.recursiveFactorial(7));
		assertEquals(40320, Factorial.recursiveFactorial(8));
		assertEquals(362880, Factorial.recursiveFactorial(9));
		assertEquals(3628800, Factorial.recursiveFactorial(10));

		// Dynamic Factorial
		assertEquals(1, Factorial.dynamicFactorial(0));
		assertEquals(1, Factorial.dynamicFactorial(1));
		assertEquals(2, Factorial.dynamicFactorial(2));
		assertEquals(6, Factorial.dynamicFactorial(3));
		assertEquals(24, Factorial.dynamicFactorial(4));
		assertEquals(120, Factorial.dynamicFactorial(5));
		assertEquals(720, Factorial.dynamicFactorial(6));
		assertEquals(5040, Factorial.dynamicFactorial(7));
		assertEquals(40320, Factorial.dynamicFactorial(8));
		assertEquals(362880, Factorial.dynamicFactorial(9));
		assertEquals(3628800, Factorial.dynamicFactorial(10));
	}

}
