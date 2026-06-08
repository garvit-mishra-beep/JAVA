class Solution {
    public void sortColors(int[] nums) {
        int L = 0, M = 0, H = nums.length - 1;
        while (M <= H) {
            if (nums[M] == 0) {
                int tmp = nums[L];
                nums[L++] = nums[M];
                nums[M++] = tmp;
            } else if (nums[M] == 1) {
                M++;
            } else {
                int tmp = nums[M];
                nums[M] = nums[H];
                nums[H--] = tmp;
            }
        }
    }
}
