package sortingMethods;

public class QuickSortDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuickSort.swaps = 0;
		int[] arr1 = {9, 3, 5, 10, 1, 7, 4, 2, 8, 6};
		QuickSort.quickSort(arr1, 0, arr1.length-1);		//sort array
		System.out.println("Swaps: " + QuickSort.swaps);	//print array
		for(int x : arr1) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		QuickSort.swaps = 0;
		int[] arr2 = {3, 7, 4, 6, 9, 10, 2, 1, 5, 8};
		QuickSort.quickSort(arr2, 0, arr2.length-1);
		System.out.println("Swaps: " + QuickSort.swaps);
		for(int x : arr2) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		QuickSort.swaps = 0;
		int[] arr3 = {1, 7, 4, 2, 3, 6, 10, 5, 8, 9};
		QuickSort.quickSort(arr3, 0, arr3.length-1);
		System.out.println("Swaps: " + QuickSort.swaps);
		for(int x : arr3) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		QuickSort.swaps = 0;
		int[] arr4 = {4, 8, 6, 10, 3, 1, 7, 5, 9, 2};
		QuickSort.quickSort(arr4, 0, arr4.length-1);
		System.out.println("Swaps: " + QuickSort.swaps);
		for(int x : arr4) {
			System.out.print(x + " ");
		}
		
	}
}
