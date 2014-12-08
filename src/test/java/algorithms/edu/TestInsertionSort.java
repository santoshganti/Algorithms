package algorithms.edu;

import org.junit.Test;
import static org.junit.Assert.*;

//import static junit.framework.Assert.*;

public class TestInsertionSort {

	@Test
	public void testSort() {
		// Test case 1
		int toSort[] = { 5, 2, 4, 6, 1, 3 };// This is the unsorted array and
											// this array is fed to quick
											// sort method for sorting
		int expected[] = { 1, 2, 3, 4, 5, 6 }; // This is the expected array
												// after sorting. This is used
												// in Assert equals to check if
												// the test is passing or not
		InserstionSort sort = new InserstionSort();// creating object of the
													// class InsertionSort
													// called sort

		int[] sorted = sort.inserstionSort(toSort);// sort object
													// is used to
													// call the
													// quick sort
													// method

		assertArrayEquals("The array is not sorted properly", sorted, expected); // checks
																					// the
																					// expected
																					// and
																					// actual
		// output.
	}
}
