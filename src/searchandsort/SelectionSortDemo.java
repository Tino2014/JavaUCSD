package searchandsort;

public class SelectionSortDemo {
	public static void main(String[] args) {
		int[] vals = {1,34,7,9,6,29,20,5,20};
		System.out.println("Original Data list: ");
		for (int i = 0; i < vals.length; i++) {
			System.out.print(vals[i] + " ");
		}
		System.out.println("");
		
		// Selection Sort
		SelectionSort a = new SelectionSort();
		int[] selectionSortedVals = a.selectionSort(vals);
		
		System.out.println("Selection Sorted Data List: ");
		for (int i = 0; i < selectionSortedVals.length; i++) {
			System.out.print(selectionSortedVals[i] + " ");
		}
		
		// insertion sort
		int[] newvals = {1,34,7,9,6,29,20,5,20};
		System.out.println("");
		InsertionSort b = new InsertionSort();
		int[] insertionSortedVals = b.insertionSort(vals);
		System.out.println("Insertion Sorted Data List: ");
		for (int i = 0; i < insertionSortedVals.length; i++) {
			System.out.print(insertionSortedVals[i] + " ");
		}
		
	}
	
}
