/*
Problem: Product of Array Except Self
Category: Arrays, Prefix Sum
Difficulty: Medium
Approach: Calculate prefix and suffix products in-place
Time Complexity: O(N)
Space Complexity: O(1)
*/

class ProductOfArrayExceptSelf_LC238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
}