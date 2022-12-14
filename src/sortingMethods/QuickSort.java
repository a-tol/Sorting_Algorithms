package sortingMethods;

public class QuickSort {
	
	public static int swaps = 0;
	
	public static void quickSort(int[] arr, int left, int right) {
		
		//add infinity, set right bound of subarray
//		arr = appendInf(arr);
//		right++;

		//set pivot, set left bound of subarray
		int pivotIndex = left;
		left++;
		
		//implies that the subarray is one value, base case
		if (left > right) return;
		
		//p -> find value greater than arr[pivotIndex]
		while(arr[left] <= arr[pivotIndex]) {
			left++;
			//substitute for integer.max
			if(left == right+1) break;
		}
		
		//q -> find value less than arr[pivotIndex]
		while(arr[right] > arr[pivotIndex]) {
			right--;
		}
		
		//did not cross
		if(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			swaps += 3;
			//continue sort
			quickSort(arr, pivotIndex, right);
		}
		
		//did cross
		else {
			int temp = arr[pivotIndex];
			arr[pivotIndex] = arr[right];
			arr[right] = temp;
			swaps += 3;
			
			temp = pivotIndex;
			pivotIndex = right;
			//partition and sort left half
			quickSort(arr, temp, pivotIndex-1);
			//partition and sort right half
			quickSort(arr, pivotIndex+1, arr.length-1);
		}
		
	}
	
//		NOT USED: Infinity append to end of array because of 
//					memory location. Last index is used for initial q. 
	
	//adds Integer.max to end of array
//	static int[] appendInf(int[] arr) {
//		int[] toReturn = new int[arr.length+1];
//		for(int i = 0; i < arr.length; i++) {
//			toReturn[i] = arr[i];
//		}
//		toReturn[arr.length] = Integer.MAX_VALUE;
//		//memory location retention
//		arr = toReturn;
//		return arr;
//	}
	
	
	//removes Integer.max from end of array
//	static int[] removeInf(int[] arr) {
//		int[] toReturn = new int[arr.length-1];
//		for(int i = 0; i < toReturn.length; i++) {
//			toReturn[i] = arr[i];
//		}
//		//memory location retention
//		arr = toReturn;
//		return arr;
//	}
}
