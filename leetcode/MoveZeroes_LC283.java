/*
Problem: Move Zeroes
Category: Two Pointers
Difficulty: Easy
Approach: Two pointers swapping non-zero elements forward
Time Complexity: O(N)
Space Complexity: O(1)
*/

class MoveZeroes_LC283 {
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