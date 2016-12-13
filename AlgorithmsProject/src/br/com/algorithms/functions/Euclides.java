package br.com.algorithms.functions;

public class Euclides {
	
	public static int recursiveEuclides(int x, int y) {
		return y == 0 ? x : recursiveEuclides(y, x % y);
	}
}
