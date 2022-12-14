package sortingMethods;

public class BubbleSort {
//	static void bubbleUp(int startIndex, int endIndex)
	
	static int swaps;
	
	static void bubbleUp(int startIndex, int endIndex, int[] values)
	  // Switches adjacent pairs that are out of order 
	  // between values[startIndex]..values[endIndex] 
	  // beginning at values[endIndex].
	  {
	    for (int index = endIndex; index > startIndex; index--) {
	      if (values[index] < values[index - 1]) {
//	        	swap(index, index - 1);
		    	int temp = values[index-1];
		    	values[index-1] = values[index];
		    	values[index] = temp;
		    	swaps+=3;
	      }
	    }
	  }
	 
	  static void bubbleSort(int arr[])
	  // Sorts the values array using the bubble sort algorithm.
	  {
		swaps = 0;
	    int index = 0;
	 
	    while (index < (arr.length - 1))
	    {
	      bubbleUp(index, arr.length - 1, arr);
	      index++;
	    }
	    System.out.println("Swaps: " + swaps);
	  }
}
