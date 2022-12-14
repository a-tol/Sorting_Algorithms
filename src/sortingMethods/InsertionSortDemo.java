package sortingMethods;

public class InsertionSortDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This should have less exchanges than bubble sort, but apparently
		//this implementation doesn't?
		
		int[] arr1 = {9, 3, 5, 10, 1, 7, 4, 2, 8, 6};
		InsertionSort.insertionSort(arr1); //sort array
		for(int x : arr1) {
			System.out.print(x + " ");
		}
		System.out.println();

		int[] arr2 = {3, 7, 4, 6, 9, 10, 2, 1, 5, 8};
		InsertionSort.insertionSort(arr2);
		for(int x : arr2) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		int[] arr3 = {1, 7, 4, 2, 3, 6, 10, 5, 8, 9};
		InsertionSort.insertionSort(arr3);
		for(int x : arr3) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		int[] arr4 = {4, 8, 6, 10, 3, 1, 7, 5, 9, 2};
		InsertionSort.insertionSort(arr4);
		for(int x : arr4) {
			System.out.print(x + " ");
		}
		
	}
}
