public class bubbleSort {
	public static int[] bsort (int[] unsorted){
		if (unsorted.length == 0 || unsorted.length == 1){
			return unsorted;
		}
		int end = unsorted.length - 1;
		while (end != 0){
			for (int i = 0; i <= end - 1; i++){
				if (unsorted[i] > unsorted[i+1]){
					int temp = unsorted[i];
					unsorted[i] = unsorted[i+1];
					unsorted[i+1] = temp;
				}
			}
			end--;
			for (int j = 0; j < unsorted.length; j++){
				System.out.print(unsorted[j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		return unsorted;
	}
	public static void main (String[] args){
//		int[] nums = {2, 5, 1, 7, 4, 3};
//		int[] nums = {2};
		int[] nums = {};
//		for (int j = 0; j < nums.length; j++){
//			System.out.print(nums[j] + " ");
//		}
//		System.out.println();
		bsort(nums);
	}
}