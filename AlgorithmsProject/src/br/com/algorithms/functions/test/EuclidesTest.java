package br.com.algorithms.functions.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.algorithms.functions.Euclides;

public class EuclidesTest {

	@Test
	public void test() {
		// Recursive Euclides
		assertEquals(6, Euclides.recursiveEuclides(6, 12));
		assertEquals(6, Euclides.recursiveEuclides(48, 30));
		assertEquals(4, Euclides.recursiveEuclides(20, 24));
	}

}
