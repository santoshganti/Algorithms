package algorithms.edu;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMergeSort {

	@Test
	public void testMergeSortIneteger() {
		int[] toSort = { 5, 2, 4, 6, 1, 3 };
		int[] expected = { 1, 2, 3, 4, 5, 6 };
		MergeSort sort = new MergeSort();
		int[] sorted = sort.mergeSort(toSort);
		assertArrayEquals(sorted, expected);
	}

}
