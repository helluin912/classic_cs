package local.binsearch;

import static org.junit.Assert.*;

import org.junit.Test;
import static local.binsearch.binsearch.bsearch;
public class binsearchTest {

	@Test public void testBsearch() {
		int[] list = {0,1,2,3,4,5,6,7,8,9,10};
		assertTrue(bsearch(1, list));
		assertTrue(bsearch(2, list));
		assertTrue(bsearch(3, list)); //in the middle of the list
		assertTrue(bsearch(5, list));
		assertTrue(bsearch(6, list));
		assertTrue(bsearch(7, list));
		assertTrue(bsearch(8, list));
		assertTrue(bsearch(9, list));
	}
	
	@Test public void notinList() {
		int[] list = {3,4,5,6,8,9,10};
		assertFalse(bsearch(0, list)); //not in lower boundary
		assertFalse(bsearch(7, list)); //not in middle of list
		assertFalse(bsearch(72, list)); //not in upper bound
	}
	
	@Test public void boundryTest() {
		int[] list = {1,3,4,5,6,8,9,10};
		assertTrue(bsearch(1, list));
		assertTrue(bsearch(10, list));
	}
	
	
	@Test public void emptyarr() {
		int[] list = {};
		assertFalse(bsearch(10, list));
	}
	
	@Test public void oneElementArray() {
		int[] list = {1};
		assertTrue(bsearch(1, list));
		assertFalse(bsearch(8, list));
		assertFalse(bsearch(-1, list));
	}
	
}
