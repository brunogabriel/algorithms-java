package br.com.algorithms.functions;

import java.util.LinkedList;

public class Hanoi {
	public static void recursiveSolution(int pins, String origem, String auxiliary, String destiny) {
		if (pins > 0) {
			recursiveSolution(pins - 1, origem, destiny, auxiliary);
			System.out.println(String.format("Move pin %d from %s to %s", pins, origem, destiny));
			recursiveSolution(pins - 1, auxiliary, origem, destiny);
		}
	}
	
	public static void numericHanoi(LinkedList<String> fifo, int pins, String origem, String auxiliary, String destiny) {
		if (pins > 0) {
			numericHanoi(fifo, pins - 1, origem, destiny, auxiliary);
			fifo.add(String.format("%d-%s-%s", pins, origem, destiny));
			numericHanoi(fifo, pins - 1, auxiliary, origem, destiny);
		}
	}
}
