import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class bubbleSortTest {
	@Test public void straightforwardsort(){
		int[] exp = {1, 2, 3, 4, 5};
		int[] orig = {2, 5, 1, 4, 3};
		assertArrayEquals(exp, bubbleSort.bsort(orig));
	}
	
	@Test public void oneElement(){
		int[] exp = {1};
		int[] orig = {1};
		assertArrayEquals(exp, bubbleSort.bsort(orig));
	}
	
	@Test public void emptySet(){
		int[] exp = {};
		int[] orig = {};
		assertArrayEquals(exp, bubbleSort.bsort(orig));
	}
	
	@Test public void ExpEqOrig(){
		int[] exp = {1, 2, 4, 8, 16};
		int[] orig = {1, 2, 4, 8, 16};
		assertArrayEquals(exp, bubbleSort.bsort(orig));
	}
	
	@Test public void duplicates(){
		int[] exp = {1, 2, 2, 4, 8};
		int[] orig = {1, 2, 4, 8, 2};
		assertArrayEquals(exp, bubbleSort.bsort(orig));
	}
	
	@Test public void negsinOrder(){
		int[] exp = {-2, 1, 4, 8, 16};
		int[] orig = {-2, 1, 4, 8, 16};
		assertArrayEquals(exp, bubbleSort.bsort(orig));
	}
	
	@Test public void negs(){
		int[] exp = {-4, 1, 2, 8, 16};
		int[] orig = {2, 16, -4, 8, 1};
		assertArrayEquals(exp, bubbleSort.bsort(orig));
	}
	
	@Test public void moreNegs(){
		int[] exp = {-1, 0, 1, 2};
		int[] orig = {2, 0, 1, -1};
		assertArrayEquals(exp, bubbleSort.bsort(orig));
	}
}
