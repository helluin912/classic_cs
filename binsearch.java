package local.binsearch;

public class binsearch {
	public static boolean bsearch (int a, int[] nums){
		if (nums.length == 0){
			return false;
		}
/*		else if (nums.length == 1){
			if (nums[0] == a){
				return true;
			}
			else {
				return false;
			}
		}
		if (nums[nums.length -1] < a){
			return false;
		}
		if (nums[0] > a){
			return false;
		}
	*/	
		int low = 0;
		int high = nums.length - 1;

		while (high >= low){
			int mid = low + ((high - low) / 2);
			if (nums[mid] < a){
				low = mid + 1;
			}
			else if (nums[mid] > a){
				high = mid - 1;
			}
			else{
				//you found a!
				return true;
			}
		}
		return false;
	}
}
