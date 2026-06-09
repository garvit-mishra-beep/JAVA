/*
Problem: Maximum Product Subarray
Category: Dynamic Programming, Arrays
Difficulty: Medium
Approach: Kadane's variant tracking min and max products
Time Complexity: O(N)
Space Complexity: O(1)
*/

class MaximumProductSubarray_LC152 {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int n : nums) {
            res = Math.max(res, n);
        }
        int curMax = 1, curMin = 1;
        for (int n : nums) {
            int temp = curMax * n;
            curMax = Math.max(temp, Math.max(curMin * n, n));
            curMin = Math.min(temp, Math.min(curMin * n, n));
            res = Math.max(res, curMax);
        }
        return res;        
    }
}