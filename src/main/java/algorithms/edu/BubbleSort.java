package algorithms.edu;

public class BubbleSort {
	public int[] bubbleSort(int array[]) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		return array;
	}
}