
public class KthLargestElement {
	public static int findKthLargest(int[] nums, int k) {
        // Convert the problem to finding the (n-k)th smallest element in the array
		int targetIndex = nums.length-k;
		return quickSelect(nums, 0, nums.length-1, targetIndex);
	}
	
	private static int quickSelect(int[] nums, int left, int right,int k) {
		if(left==right) {
			return nums[left];       // Only one element in the array
		}
		
		  // Select a pivot and partition the array
		int pivotIndex = partition(nums, left, right);
		
		// The pivot is in its final sorted position
        if(pivotIndex==k) {
        	return nums[pivotIndex];
        }
        else if(pivotIndex < k) {
        	//Recur on the right part
        	return quickSelect(nums, pivotIndex+1, right, k);
        }
        else {
        	// Recur on the left part
        	return quickSelect(nums, left, pivotIndex -1, k);
        }
	}

	private static int partition(int[] nums, int left, int right) {
		int pivot = nums[right];        // Choose the rightmost element as the pivot
		int i = left;
		
		for(int j = left; j<right; j++) {
			if(nums[j] <= pivot) {
				// Swap elements to place elements smaller than the pivot on the left
				swap(nums, i, j);
				i++;
			}
		}
		
		// Place the pivot in its correct position
		swap(nums, i, right);
		return i;          // Return the index of the pivot

	}
	
	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
public static void main(String[] args) {
	int[] arr = {3,2,1,5,6,4};
	int k=2;
	System.out.println(findKthLargest(arr, k));
}
}