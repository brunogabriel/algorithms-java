package br.com.algorithms.search;

public class BinarySearch {

	public static int binarySearch(int array[], int element) {
		if (array == null || array.length == 0) {
			return -1;
		} else {
			int start = 0;
			int end = array.length - 1;

			while (start <= end) {
				int mid = (start + end) / 2;

				if (array[mid] == element) {
					return mid;
				} else if (array[mid] < element) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
			return -1;
		}
	}

	public static int recursiveBinarySearch(int array[], int start, int end, int value) {
		if (array == null || array.length == 0 || end < start) {
			return -1;
		}

		int mid = (start + end) / 2;

		if (array[mid] == value) {
			return mid;
		} else if (array[mid] < value) {
			return recursiveBinarySearch(array, mid + 1, end, value);
		} else {
			return recursiveBinarySearch(array, start, mid - 1, value);
		}

	}
}
