package algorithms.edu;

public class QuickSort {

	public int[] quickSort(int Array[], int p, int r) {
		if (p < r) {
			int q = partition(Array, p, r);
			quickSort(Array, p, q - 1);
			quickSort(Array, q + 1, r);
		}
		return Array;
	}

	public int partition(int Array[], int p, int r) {
		int x = Array[r];
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if (Array[j] <= x) {
				i = i + 1;
				exchange(i, j);
			}
		}
		exchange(i + 1, r);
		return (i + 1);

	}

	private int ExchangeArray[];

	private void exchange(int a, int b) {
		int temp = 0;
		temp = ExchangeArray[a];
		ExchangeArray[a] = ExchangeArray[b];
		ExchangeArray[b] = temp;

	}

}