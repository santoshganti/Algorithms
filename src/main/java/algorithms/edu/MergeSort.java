package algorithms.edu;

public class MergeSort {
	public int[] mergeSort(int[] B) {
		// base case for recursion
		if (B.length <= 1) {
			return B;
		}
		int midpoint = (B.length) / 2;
		int[] left = new int[midpoint];// left array is simple but right array
										// is tricky
		int[] right;
		if (B.length % 2 == 0) {
			right = new int[midpoint]; // if B's length is even the arrays can
										// be divided into half
		} else {
			right = new int[midpoint + 1];// else if the B's length is odd.
											// midpoint no. of elements are gone
											// into left array and (midpoint+1)
											// no.
											// of elements into right array
		}
		int[] result = new int[B.length];
		// Now we populate the left array
		for (int i = 0; i < midpoint; i++) {
			left[i] = B[i];
		}
		// Now we populate the left array
		int x = 0;// we have a problem here, B starts at midpoint but right
					// array should start from zero because its a new array
		for (int j = midpoint; j < B.length; j++) {
			// just to be cautious that my x index doesn't cross the array
			// length
			if (x < right.length) {
				right[x] = B[j];
				x++;
			}
		}
		left = mergeSort(left); // left array called itself until there is
								// only one element left and using base case we
								// break out of recursion
		right = mergeSort(right);// right array called itslef until there is
									// only one element left and using base case
									// we break out of recursion
		result = merge(left, right);
		return result;
	}

	public int[] merge(int[] left, int[] right) {
		int lengthResult = left.length + right.length;
		int[] result = new int[lengthResult];
		int indexL = 0;
		int indexR = 0;
		int indexRes = 0;
		// while there are elements left keep repeating the loop
		while (indexL < left.length || indexR < right.length) {
			// if there are elements left in the both arrays
			if ((indexL < left.length) && (indexR < right.length)) {
				// this is if left array has an element than right the element
				// is copied to the result array
				if (left[indexL] <= right[indexR]) {
					result[indexRes] = left[indexL];
					indexRes++;
					indexL++;
				} else {
					result[indexRes] = right[indexR];
					indexR++;
					indexRes++;
				}
			} else if (indexL < left.length) {
				result[indexRes] = left[indexL];
				indexRes++;
				indexL++;
			} else if (indexR < right.length) {
				result[indexRes] = right[indexR];
				indexR++;
				indexRes++;
			}
		}
		return result;

	}
}
