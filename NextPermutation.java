import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        
        // Find the first element from the end that is smaller than the element after it
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // If such an element is found, find the element larger than nums[i] from the end and swap
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        
        // Reverse the elements from i+1 to the end of the array
        reverse(nums, i + 1, n - 1);
    }
    
    // Helper function to swap two elements in an array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    // Helper function to reverse the elements in an array from start to end
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        nextPermutation(nums1);
        System.out.println(Arrays.toString(nums1));  // Output: [1, 3, 2]
        
        int[] nums2 = {3, 2, 1};
        nextPermutation(nums2);
        System.out.println(Arrays.toString(nums2));  // Output: [1, 2, 3]
        
        int[] nums3 = {1, 1, 5};
        nextPermutation(nums3);
        System.out.println(Arrays.toString(nums3));  // Output: [1, 5, 1]
    }
}
