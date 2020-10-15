package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest   {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = {"word","hello","what","wow","person","hi"};
		String value = "hi";
		assertEquals(5,_00_LinearSearch.linearSearch(words, value));
		
		}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] ints = {0,1,2,3,4,5};
		int start = 0; 
		int end = 5; 
		int value = 5; 
		assertEquals(5,_01_BinarySearch.binarySearch(ints, start, end, value));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] intss = {0,1,2,3,4,5,6,8,9};
		int value = 5;
		assertEquals(5,_02_InterpolationSearch.interpolationSearch(intss, value));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		int value = 5; 
		assertEquals(5,_03_ExponentialSearch.exponentialSearch(array, value));
	}
}
