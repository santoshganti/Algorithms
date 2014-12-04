package algorithms.edu;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuickSort {
	// method to test the quick sort
	@Test
	public void test() {
		int toSort[] = { 5, 2, 4, 6, 1, 3 }; // This is the unsorted array and
												// this array is fed to quick
												// sort method for sorting
		int expected[] = { 1, 2, 3, 4, 5, 6 };// This is the expected array
												// after sorting. This is used
												// in Assert equals to check if
												// the test is passing or not
		QuickSort sort = new QuickSort();// creating object of the class
											// QuickSort called sort
		int[] sorted = sort.quickSort(toSort, 1, toSort.length);// sort object
																// is used to
																// call the
																// quick sort
																// method
		assertArrayEquals(sorted, expected); // checks the expected and actual
												// output.
	}

}
