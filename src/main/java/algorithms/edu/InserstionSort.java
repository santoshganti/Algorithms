package algorithms.edu;

public class InserstionSort {

	public int[] inserstionSort(int inputarray[]) {

		for (int j = 1; j < inputarray.length; j++) {
			int key = inputarray[j];
			int i = j - 1;

			while ((i > -1) && (inputarray[i] > key)) {
				inputarray[i + 1] = inputarray[i];
				i--;
			}
			inputarray[i + 1] = key;

		}

		return inputarray;
	}
}
