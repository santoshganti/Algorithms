package algorithms.edu;

public class MergeSort {
	public int[] mergeSort(int array[]) {
		int n = array.length;
		if (n < 2)
			return array;
		
		int mid = n / 2;//to break the array

		int[] leftarray = new int[mid];
		int[] rightarray = new int[n - mid];

		for (int i = 0; i <= mid - 1; i++) {
			leftarray[i] = array[i];
		}
		for (int i = mid; i <= n - 1; i++) {
			rightarray[i - mid] = array[i];
		}
		mergeSort(leftarray);
		mergeSort(rightarray);
		merge(leftarray,rightarray,array);

		return array;
	}

	public void merge(int leftarray[], int rightarray[], int array[]) {
		int l = leftarray.length;
		int r = rightarray.length;
		int i = 0, j = 0, k = 0;
		while (i < l && j < r) {
			if (leftarray[i] <= rightarray[j]) {
				array[k] = leftarray[i];
				i = i + 1;
			} else {
				array[k] = rightarray[j];
				j = j + 1;
			}
			k = k + 1;
			while (i < l) {
				array[k] = leftarray[i];
				i = i + 1;
				k = k + 1;
			}
			while (i < r) {
				array[k] = rightarray[i];
				i = i + 1;
				k = k + 1;
			}
		}

	}
}
