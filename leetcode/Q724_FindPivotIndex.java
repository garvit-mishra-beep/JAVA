class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0, right = 0;
        for (int x : nums) total += x;
        for (int i = 0; i < nums.length; i++) {
            if (right * 2 == total - nums[i]) return i;
            right += nums[i];
        }
        return -1;
    }
}
