package datastructures.search;

public class LinearSearchDemo {

	public static int linearSearch(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int numbers[] = { 5, 3, 8, 4, 2, 7, 1, 9 };
		int target = 4;
		int result = linearSearch(numbers, target);

		if (result != -1) {
			System.out.println("element found at index " + result);
		} else {
			System.out.println("Element is not fount at index " + result);
		}
	}

}
