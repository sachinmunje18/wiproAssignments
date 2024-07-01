package datastructures.search;

public class JumpSearchDemo {
	
	static int jumpSearch(int[] arr, int x) {
		int n = arr.length;
		int step= (int) Math.floor(Math.sqrt(n));
		int prev=0;
		
		for(int minStep = Math.min(step, n)-1; 
				arr[minStep] < x; 
				minStep = Math.min(step, n)-1) {
			
			prev = step;
			step += (int)Math.floor(Math.sqrt(Math.sqrt(n)));
			
			if(prev>=n)
				return -1;
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {0,1,2,3,3,5,8,13,21,34,55,89,144,233,277,610};
		int x=55;
		int result = jumpSearch(arr,x);
		System.out.println("/n numbers :" + x + " is at index : " + result);
		}
		
		
	}


