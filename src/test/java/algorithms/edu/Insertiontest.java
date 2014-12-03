package algorithms.edu;

import org.junit.Test;
import static junit.framework.Assert.*;

public class Insertiontest {
	@Test
	public void testSort() {
		// Test case 1
		int toSort[] = { 5, 2, 4, 6, 1, 3 };
		int expected[] = { 1, 2, 3, 4, 5, 6 };
		Inserstionsort sort = new Inserstionsort();

		int[] sorted = sort.inserstionSort(toSort);

		assertEquals(sorted, expected);

	}
}
