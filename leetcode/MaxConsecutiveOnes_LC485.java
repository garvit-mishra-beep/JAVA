/*
Problem: Max Consecutive Ones
Category: Arrays
Difficulty: Easy
Approach: Single-pass counter reset on zero
Time Complexity: O(N)
Space Complexity: O(1)
*/

class MaxConsecutiveOnes_LC485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}