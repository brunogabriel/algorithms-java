package br.com.algorithms.functions.test;

import static org.junit.Assert.*;

import org.junit.Test;


import java.util.LinkedList;

import br.com.algorithms.functions.Hanoi;

public class HanoitTest {

	
	@Test
	public void testTwoPins() {
		LinkedList<String> answer = new LinkedList<String>();
		answer.add("1-origem-auxiliary");
		answer.add("2-origem-destiny");
		answer.add("1-auxiliary-destiny");
		
		LinkedList<String> fifo = new LinkedList<String>();
		Hanoi.numericHanoi(fifo, 2, "origem", "auxiliary", "destiny");
		assertArrayEquals(answer.toArray(), fifo.toArray());
	}
	
	@Test
	public void testThreePins() {
		LinkedList<String> answer = new LinkedList<String>();
		answer.add("1-origem-destiny");
		answer.add("2-origem-auxiliary");
		answer.add("1-destiny-auxiliary");
		answer.add("3-origem-destiny");
		answer.add("1-auxiliary-origem");
		answer.add("2-auxiliary-destiny");
		answer.add("1-origem-destiny");

		LinkedList<String> fifo = new LinkedList<String>();
		Hanoi.numericHanoi(fifo, 3, "origem", "auxiliary", "destiny");
		assertArrayEquals(answer.toArray(), fifo.toArray());
	}

}
