package datastructures.search;

public class BinarySearchDemo {

	static int binarySearch(int arr[], int x) {

		int low = 0, high = arr.length - 1;
		
		while(low<= high) {
			
		int mid = low + (high - low) / 2;

		if (arr[mid] == x)
			return mid;
		//if x is greater, ignore left half
		if (arr[mid] < x)
			low = mid + 1;
		//if x is greater , ignore left half
		else
			high = mid - 1;

	}		return -1;

	}
	public static void main(String[] args) {

		int arr[]= { 10,20,30,40,50};
		int x = 40;
		int result= binarySearch(arr, x);
		if(result == -1) 
			System.out.println("element is not presnet is arr" + result);
			else 
				System.out.println("element is present at index " + result );
			
		
	}

}
