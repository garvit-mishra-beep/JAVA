/*
Problem: Find the Duplicate Number
Category: Medium
Difficulty: Two Pointers, Hashing
Approach: Floyd's Cycle Detection (Tortoise and Hare)
Time Complexity: O(N)
Space Complexity: O(1)
*/

class FindTheDuplicateNumber_LC287 {
    public int findDuplicate(int[] nums) {
     Arrays.sort(nums);
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }

        return len;   
    }
}