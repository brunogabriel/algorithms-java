package br.com.algorithms.sort;

public class QuickSort {
	
	public static void sort(int[] array) {
		if (array != null && array.length > 1) {
			quicksort(array, 0, array.length - 1);
		}
	}
	
	private static int partition(int[] array, int start, int end) {
		int i = start + 1;
		int j = end;
		
		int pivot = array[start];
		
		while (i <= j) {
			if (array[i] <= pivot) {
				i++;
			} else if (array[j] > pivot) {
				j--;
			} else {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		
		array[start] = array[j];
		array[j] = pivot;
		
		return j;
	}
	
	private static void quicksort(int[] array, int start, int end) {
		if (start < end) {
			int pivot = partition(array, start, end);
			quicksort(array, start, pivot -1);
			quicksort(array, pivot + 1, end);
		}
	}
}
