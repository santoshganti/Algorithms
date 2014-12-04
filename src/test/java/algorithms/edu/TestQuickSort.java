package algorithms.edu;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuickSort {

	@Test
	public void test() {
		int toSort[] = { 5, 2, 4, 6, 1, 3 };
		int expected[] = { 1, 2, 3, 4, 5, 6 };
		QuickSort sort = new QuickSort();
		int[] sorted = sort.quickSort(toSort, 1, toSort.length);
		assertArrayEquals(sorted, expected);
	}

}
