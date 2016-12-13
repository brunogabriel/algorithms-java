package br.com.algorithms.functions;

public class Factorial {

	public static int factorial(int number) {
		if (number <= -1) {
			throw new RuntimeException("Invalid number, should be greater or equals than zero");
		} else if (number == 0) {
			return 1;
		} else {
			int factorial = 1;
			for (int i = 2; i <= number; ++i) {
				factorial *= i;
			}
			return factorial;
		}
	}
	
	public static int recursiveFactorial(int number) {
		if (number <= -1) {
			throw new RuntimeException("Invalid number, should be greater or equals than zero");
		} else if (number == 0) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}
	
	public static int dynamicFactorial(int number) {
		if (number <= 1) {
			return factorial(number);
		}
		
		int[] dynamicArray = new int[number+1];
		dynamicArray[0] = 1;
		dynamicArray[1] = 1;
		
		for (int i = 2; i < dynamicArray.length; ++i) {
			dynamicArray[i] = i * dynamicArray[i-1];
		}
		
		return dynamicArray[number];
	}

}
