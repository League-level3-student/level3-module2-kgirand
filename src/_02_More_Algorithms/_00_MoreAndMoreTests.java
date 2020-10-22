package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }
	
	private Object multiply(int i, int j) {
		// TODO Auto-generated method stub
		int k = i*j;
		return i + " x " + j + " = " + k;
	}
	
	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }

private boolean isPrime(int i) {
		// TODO Auto-generated method stub
	if(i<=1) {
		return false;
	}
	for(int j = 2; j < i; j++) {
		if(i%j==0) {
			return false;
		}
	}
	return true;
	}

	@Test
	public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }

	private boolean isSquare(int i) {
		// TODO Auto-generated method stub
		for(int j = 0; j < i/ 2 + 2; j++) {
			if(j*j == i) {
				return true;
			}
		}
		return false;
	}

	@Test
	  public void CubeTest() {

		assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }

	private boolean isCube(int i) {
		// TODO Auto-generated method stub
		double cubeRoot = Math.cbrt(i);
		int val = (int) (cubeRoot);
		System.out.println(i);
		if(((cubeRoot*10))-(val*10)==0) {
			return true;
		}
		return false;
	}

	




}
