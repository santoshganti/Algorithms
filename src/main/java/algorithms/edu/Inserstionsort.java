package algorithms.edu;

public class Inserstionsort {
	public void printSequence(int[] sortedsequence) {
		System.out.print("\nThe sorted sequence is ");
		for (int i = 0; i < sortedsequence.length; i++) {
			System.out.print(sortedsequence[i] + ",");
		}
		System.out.println("\n");
	}

	public int[] inserstionSort(int inputarray[]) {
		System.out.print("The given sequence is ");
		for (int k = 0; k < inputarray.length; k++) {
			System.out.print(inputarray[k] + ",");
		}
		for (int j = 1; j < inputarray.length; j++) {
			int key = inputarray[j];
			int i = j - 1;

			while ((i > -1) && (inputarray[i] > key)) {
				inputarray[i + 1] = inputarray[i];
				i--;
			}
			inputarray[i + 1] = key;
		}
		printSequence(inputarray);

		return inputarray;
	}
}
