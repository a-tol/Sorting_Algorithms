package sortingMethods;

public class MergeSort {
	
	public static int swaps;
	
//	static void mergeSort(int first, int last)
	public static void mergeSort(int[] arr, int first, int last)
	  // Sorts the values array using the merge sort algorithm.
	  {
		swaps = 0;
	    if (first < last)
	    {
	      int middle = (first + last) / 2;;
	      mergeSort(arr, first, middle);
	      mergeSort(arr, middle + 1, last);
	      merge(arr, first, middle, middle + 1, last);
	    }
	  }
	//following presentation pseudocode
	static void merge(int arr[], int leftFirst, int leftEnd, int rightFirst, int rightEnd) {
		//size of left half + size of right half
		int leftLength = leftEnd - leftFirst + 1;
		int rightLength = rightEnd - rightFirst + 1;
		//create tempArray of size of left half and right half
		//that contains left half + right half sorted
		int[] tempArray = new int[leftLength + rightLength];
		int index = 0;
		
		//while there are still elements to compare between left and right
		while(leftEnd - leftFirst >= 0 && rightEnd - rightFirst >= 0) {
			//if left element < right element put left into sorted tempArray
			//right otherwise
			if(arr[leftFirst] < arr[rightFirst]) {
				tempArray[index] = arr[leftFirst];
				swaps++;
				leftFirst++;
			}else {
				tempArray[index] = arr[rightFirst];
				swaps++;
				rightFirst++;
			}
			index++;
		}
		//cases for when there are more elements in one sub-array than another
		while(leftEnd - leftFirst >= 0 ) {
			tempArray[index] = arr[leftFirst];
			swaps++;
			leftFirst++;
			index++;
		}
		while(rightEnd - rightFirst >= 0 ) {
			tempArray[index] = arr[rightFirst];
			swaps++;
			rightFirst++;
			index++;
		}
		
		//reverse leftFirst and rightFirst back to their original indexes
		leftFirst -= leftLength;
		rightFirst -= rightLength;
		
		//copy value of combined sorted sub-array to corresponding sub-array
		int count = 0;
		for(int i = leftFirst; i <= rightEnd; i++) {
			arr[i] = tempArray[count];
			count++;
		}
	}
	
//	Set index to leftFirst
//	while more elements in left half AND more elements 
//	in right half
//	    if values[leftFirst] < values[rightFirst]
//	        Set tempArray[index] to values[leftFirst]
//	        Increment leftFirst
//	    else
//	        Set tempArray[index] to values[rightFirst]
//	        Increment rightFirst
//	    Increment index
//	Copy any remaining elements from left half to 
//	tempArray
//	Copy any remaining elements from right half to 
//	tempArray
//	Copy the sorted elements from tempArray back into 
//	values
	
	
}
