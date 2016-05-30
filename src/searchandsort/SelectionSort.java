package searchandsort;

public class SelectionSort extends SortUtil{
	public int[] selectionSort(int[] vals) {
		int indexMin;
		for (int i = 0; i < vals.length - 1; i++) {
			indexMin = i;
			for (int j = i + 1; j < vals.length; j++) {
				if (vals[j] < vals[indexMin]) {
					indexMin = j;
				}
			}
			swap(vals, indexMin, i);
		}
		return vals;
	}
}
