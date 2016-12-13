package br.com.algorithms.functions;

public class Fibonnaci {
	
	public static int fibonnaci(int number) {
		if (number <= -1) {
			throw new RuntimeException("Invalid number, should be greater or equals than zero");
		}
		
		if (number == 0) {
			return 0;
		} else if (number <= 2) {
			return 1;
		} else {
			int sequence = 1;
			int previous = 1;
			for (int i = 3; i<= number; ++i) {
				int temporary = sequence;
				sequence+= previous;
				previous = temporary;
			}
			
			return sequence;
		}
	}
	
	public static int recursiveFibonnaci(int number) {
		if (number <= -1) {
			throw new RuntimeException("Invalid number, should be greater or equals than zero");
		} else if (number <= 2) {
			return number == 0 ? 0 : 1;
		} else {
			return recursiveFibonnaci(number - 1) + recursiveFibonnaci(number - 2);
		}
	}
	
	public static int dynamicFibonnaci(int number) {
		if (number <= 2) {
			return fibonnaci(number);
		}
		
		int[] dynamicArray = new int[number+1];
		dynamicArray[0] = 0;
		dynamicArray[1] = 1;
		dynamicArray[2] = 1;
		
		for (int i = 3; i < dynamicArray.length; ++i) {
			dynamicArray[i] = dynamicArray[i-1] + dynamicArray[i-2];
		}
		
		return dynamicArray[number];
	}

}
