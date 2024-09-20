// There is an integer array nums sorted in ascending order (with distinct values).

// Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4
// Example 2:

// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1

public class RotatedSearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            }

            // Check if left part is sorted
            if (nums[left] <= nums[mid]) {
                // Target is in the sorted left part
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // Focus on the left half
                } else {
                    left = mid + 1; // Focus on the right half
                }
            }
            // Else, right part is sorted
            else {
                // Target is in the sorted right part
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // Focus on the right half
                } else {
                    right = mid - 1; // Focus on the left half
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        RotatedSearch r = new RotatedSearch();
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println("Target index: " + r.search(nums1, target1));  // Output should be 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println("Target index: " + r.search(nums2, target2));  // Output should be -1
    }
}
