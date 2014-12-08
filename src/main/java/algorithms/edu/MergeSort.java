package algorithms.edu;

public class MergeSort {
	public int[] mergeSort(int[] array) {
		// base case for recursion
		if (array.length <= 1) {
			return array;
		}
		int midpoint = (array.length) / 2;
		int[] leftarray = new int[midpoint];// left array is simple but right
											// array
		// is tricky
		int[] rightarray;
		if (array.length % 2 == 0) {
			rightarray = new int[midpoint]; // if B's length is even the arrays
											// can
			// be divided into half
		} else {
			rightarray = new int[midpoint + 1];// else if the B's length is odd.
												// midpoint no. of elements are
												// gone
												// into left array and
												// (midpoint+1)
												// no.
												// of elements into right array
		}
		int[] result = new int[array.length];
		// Now we populate the left array
		for (int i = 0; i < midpoint; i++) {
			leftarray[i] = array[i];
		}
		// Now we populate the left array
		int x = 0;// we have a problem here, B starts at midpoint but right
					// array should start from zero because its a new array
		for (int j = midpoint; j < array.length; j++) {
			// just to be cautious that my x index doesn't cross the array
			// length
			if (x < rightarray.length) {
				rightarray[x] = array[j];
				x++;
			}
		}
		leftarray = mergeSort(leftarray); // left array called itself until
											// there is
		// only one element left and using base case we
		// break out of recursion
		rightarray = mergeSort(rightarray);// right array called itslef until
											// there is
		// only one element left and using base case
		// we break out of recursion
		result = merge(leftarray, rightarray);
		return result;
	}

	public int[] merge(int[] leftarray, int[] rightarray) {
		int lengthResult = leftarray.length + rightarray.length;
		int[] resultarray = new int[lengthResult];
		int indexOfLeftArray = 0;
		int indexOfRightArray = 0;
		int indexOfResultArray = 0;
		// while there are elements left keep repeating the loop
		while (indexOfLeftArray < leftarray.length || indexOfRightArray < rightarray.length) {
			// if there are elements left in the both arrays
			if ((indexOfLeftArray < leftarray.length) && (indexOfRightArray < rightarray.length)) {
				// this is if left array has an element than right the element
				// is copied to the result array
				if (leftarray[indexOfLeftArray] <= rightarray[indexOfRightArray]) {
					resultarray[indexOfResultArray] = leftarray[indexOfLeftArray];
					indexOfResultArray++;
					indexOfLeftArray++;
				} else {
					resultarray[indexOfResultArray] = rightarray[indexOfRightArray];
					indexOfRightArray++;
					indexOfResultArray++;
				}
			} else if (indexOfLeftArray < leftarray.length) {
				resultarray[indexOfResultArray] = leftarray[indexOfLeftArray];
				indexOfResultArray++;
				indexOfLeftArray++;
			} else if (indexOfRightArray < rightarray.length) {
				resultarray[indexOfResultArray] = rightarray[indexOfRightArray];
				indexOfRightArray++;
				indexOfResultArray++;
			}
		}
		return resultarray;

	}
}
