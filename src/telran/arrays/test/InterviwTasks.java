package telran.arrays.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import static telran.arrays.InterviewTasks.*;

import org.junit.jupiter.api.Test;

class InterviwTasks {

	@Test
	void sortTest() {
		short [] array = {5, 4, 3, 2, 1};
		sort(array);
		short [] expected = {1, 2, 3, 4, 5};
		
		short [] array1 = {5, 5, 4, 4, 3, 3, 2, 2, 1, 1};
		sort(array1);
		short [] expected1 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		
		assertArrayEquals(expected, array);
		assertArrayEquals(expected1, array1);
	}
	@Test
	void getMaxWithNegativePresentationTest() {
		short [] array = {5, 4, 3, 2, 1, -5};
		assertEquals(5, getMaxWithNegativePresentation(array));
		
		short [] array1 = {5, 4, 3, 2, 1, -5, -4, -3, -1, 6, -7};
		assertEquals(5, getMaxWithNegativePresentation(array1));
		
		short [] array3 = {5, 4, 3, 2, 1};
		assertEquals(-1, getMaxWithNegativePresentation(array3));
	}

}
