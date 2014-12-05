package algorithms.edu;

public class BubbleSort {
	public int[] bubbleSort(int array[]) {
		int n = array.length;
		for (int k = 1; k <=n - 1; k++) {
			for (int i = 0; i <= n-2; i++) {
				if (array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}

		}
		return array;
	}
}