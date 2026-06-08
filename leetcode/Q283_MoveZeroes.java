class Solution {
     public void moveZeroes(int[] nums) {
        int N = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                 N++; 
            }
            else if (N > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-N]=t;
            }
        }
    }
}