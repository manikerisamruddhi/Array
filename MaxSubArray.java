// Given an integer array nums, find the 
// subarray
//  with the largest sum, and return its sum.

 

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.
// Example 3:

// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

public class MaxSubArray {

    public static int maxSubArray(int[] nums) {
        // Initialize max_current and max_global with the first element of the array
        int max_current = nums[0];
        int max_global = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update max_current: either extend the existing subarray or start a new subarray
            max_current = Math.max(nums[i], max_current + nums[i]);

            // Update max_global if the current subarray sum is larger than the global maximum
            if (max_current > max_global) {
                max_global = max_current;
            }
        }

        // Return the global maximum sum
        return max_global;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max subarray sum: " + maxSubArray(nums1)); // Output: 6

        int[] nums2 = {1};
        System.out.println("Max subarray sum: " + maxSubArray(nums2)); // Output: 1

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Max subarray sum: " + maxSubArray(nums3)); // Output: 23
    }
}
