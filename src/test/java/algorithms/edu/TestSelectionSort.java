package algorithms.edu;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSelectionSort {

	@Test
	public void testSelection() {
		int[] toSort = { 2, 7, 4, 1, 5, 3 };
		int[] expected = { 1, 2, 3, 4, 5, 7 };
		SelectionSort sort = new SelectionSort();
		int[] sorted = sort.selectionSort(toSort);
		assertArrayEquals(sorted, expected);
	}
}
