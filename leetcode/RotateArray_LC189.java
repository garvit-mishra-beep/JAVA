/*
Problem: Rotate Array
Category: Arrays, Two Pointers
Difficulty: Medium
Approach: Reverse portions of the array
Time Complexity: O(N)
Space Complexity: O(1)
*/

class RotateArray_LC189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}