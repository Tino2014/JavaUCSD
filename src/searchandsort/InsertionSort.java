package searchandsort;


public class InsertionSort extends SortUtil{
	public int[] insertionSort(int[] vals) {
		int currInd;
		for (int pos = 1; pos < vals.length; pos++) {
			currInd = pos;
			while ( currInd > 0 && vals[currInd] < vals[currInd - 1]) {
				swap(vals, currInd, currInd - 1);
				currInd = currInd - 1;
			}
		}
		return vals;
	}
}
