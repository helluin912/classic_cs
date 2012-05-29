import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class mSortTest {
	@Test public void inOrder(){
		int[] exp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] orig = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		mSort.merge_sort(orig, 0, 9);
		assertArrayEquals(exp, orig);
	}
	
	@Test public void backwards(){
		int[] exp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] orig = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		mSort.merge_sort(orig, 0, 9);
		assertArrayEquals(exp, orig);
	}
	
	@Test public void one(){
		int[] exp = {4};
		int[] orig = {4};
		mSort.merge_sort(orig, 0, 0);
		assertArrayEquals(exp, orig);
	}
	
	@Test public void random(){
		int[] exp = {0, 2, 5, 8, 24, 47, 63, 92, 96};
		int[] orig = {0, 8, 2, 5, 63, 92, 24, 96, 47};
		mSort.merge_sort(orig, 0, 8);
		assertArrayEquals(exp, orig);
	}
	
	@Test public void duplicates(){
		int[] exp = {1, 2, 2, 2, 3, 4};
		int[] orig = {2, 1, 3, 4, 2, 2};
		mSort.merge_sort(orig, 0, 5);
		assertArrayEquals(exp, orig);
	}
	
	@Test public void all_neg(){
		int[] exp = {-8, -6, -4, -3, -2, -1, 0};
		int[] orig = {-6, 0, -2, -4,-1, -3, -8};
		mSort.merge_sort(orig, 0, 6);
		assertArrayEquals(exp, orig);
	}
	
	@Test public void plusAndminus(){
		int[] exp = {-8, -5, -2, -1, 1, 2, 5, 8};
		int[] orig = {-1, 5, -8, -2, -5, 1, 8, 2};
		mSort.merge_sort(orig, 0, 7);
		assertArrayEquals(exp, orig);
	}
}
