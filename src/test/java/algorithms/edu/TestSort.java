package algorithms.edu;

import org.junit.Test;
import static org.junit.Assert.*;

//import static junit.framework.Assert.*;

public class TestSort {

	@Test
	public void testSort() {
		// Test case 1
		int toSort[] = { 5, 2, 4, 6, 1, 3 };
		int expected[] = { 1, 2, 3, 4, 5, 6 };
		InserstionSort sort = new InserstionSort();

		int[] sorted = sort.inserstionSort(toSort);

		assertArrayEquals("The array is not sorted properly",sorted, expected);

	}
}
