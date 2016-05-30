package searchandsort;

public class SortUtil {
	public void swap(int[] vals, int indexI, int indexJ) {
		int temp;
		temp = vals[indexI];
		vals[indexI] = vals[indexJ];
		vals[indexJ] = temp;
	}
}
