/*
Problem: Maximum Subarray
Category: Dynamic Programming, Arrays
Difficulty: Medium
Approach: Kadane's Algorithm
Time Complexity: O(N)
Space Complexity: O(1)
*/

class MaximumSubarray_LC53 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
       return maxSum;
    }
}