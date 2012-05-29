
public class mSort {
	public static void merge_sort (int[] arr, int lo, int n){
		/*low, middle, high refer to the array index
		middle can also be defined as middle = low + ((high - low) / 2)
	    but I don't think I'll have an array large enough such that low + high will be
	    greater than the range of integers. */
		int low = lo;
	    int high = n;
	    if (low >= high) {
	      return;
	    }
	    int middle = (low + high) / 2;
	    
	    
	    merge_sort(arr, low, middle);
	    merge_sort(arr, middle + 1, high);
	    
		int end_low = middle;  //upper bound of the lower half of the array
	    int start_high = middle + 1;  //lower bound  of the upper half of the array 
	    
		while ((low <= end_low) && (start_high <= high)) {
			if (arr[low] < arr[start_high]) {
				low++;
	        } 
			else {
				int temp = arr[start_high];
				for (int k = start_high - 1; k >= low; k--) {
					arr[k+1] = arr[k];
				}
	                
				arr[low] = temp;
	            low++;
	            end_low++;
	            start_high++;
	        }
		}
	}
	
	public static void main (String[] args){
	    int i;
	    int array[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
	    System.out.println("Values Before the sort:");
	    
	    for(i = 0; i < array.length; i++)
	    	System.out.print(array[i] + " ");
	    System.out.println();
	    
	    merge_sort(array,0, array.length-1);
	    System.out.println("Values after the sort:");
	    for(i = 0; i <array.length; i++)
	    	System.out.print(array[i] + " ");
	    System.out.println();
	}
}
