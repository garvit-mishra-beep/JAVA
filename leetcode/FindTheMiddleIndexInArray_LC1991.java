/*
Problem: Find the Middle Index in Array
Category: Prefix Sum
Difficulty: Easy
Approach: Track running left sum vs total sum
Time Complexity: O(N)
Space Complexity: O(1)
*/

class FindTheMiddleIndexInArray_LC1991 {
    public int findMiddleIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}