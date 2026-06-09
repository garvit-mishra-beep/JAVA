/*
Problem: Running Sum of 1D Array
Category: Prefix Sum
Difficulty: Easy
Approach: In-place prefix additions
Time Complexity: O(N)
Space Complexity: O(1)
*/

class RunningSumOf1DArray_LC1480 {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}