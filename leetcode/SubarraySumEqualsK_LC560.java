/*
Problem: Subarray Sum Equals K
Category: Prefix Sum, Hashing
Difficulty: Medium
Approach: HashMap storing prefix sum frequencies
Time Complexity: O(N)
Space Complexity: O(N)
*/

class SubarraySumEqualsK_LC560 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for(int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                if(currentSum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}