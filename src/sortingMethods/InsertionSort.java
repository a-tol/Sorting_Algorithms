package sortingMethods;

public class InsertionSort {
//	static void insertItem(int startIndex, int endIndex;
	static int swaps;
	static void insertItem(int startIndex, int endIndex, int[] values)
	  // Upon completion, values[0]..values[endIndex] are sorted.
	  {
	    boolean finished = false;
	    int current = endIndex;
	    boolean moreToSearch = true;
	    while (moreToSearch && !finished)
	    {
	      if (values[current] < values[current - 1])
	      {
//	        swap(current, current - 1);
	    	int temp = values[current-1];
	    	values[current-1] = values[current];
	    	values[current] = temp;
	    	swaps+=3;
	        current--;
	        moreToSearch = (current != startIndex);
	      }
	      else {
	        finished = true;
	      }
	    }
	  }
	 
	  public static void insertionSort(int[] arr)
//	  public static void insertionSort()
	  // Sorts the values array using the insertion sort algorithm.
	  {
		  swaps = 0;
//	   for (int count = 1; count < SIZE; count++)
	   for (int count = 1; count < arr.length; count++)
//		  insertItem(0, count);
	      insertItem(0, count, arr);
	   System.out.println("Swaps: " + swaps);
	  }
}
