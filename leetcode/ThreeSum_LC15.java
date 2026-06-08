/*
Problem: 3Sum
Category: Arrays, Two Pointers
Difficulty: Medium
Approach: Sort array and use two pointers for remaining sum
Time Complexity: O(N^2)
Space Complexity: O(1)
*/

class ThreeSum_LC15 {
    
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
       int n = nums.length;
       for(int i = 0;i < n - 2;i++){
        int j = i+1,k = n - 1;
        if(i > 0 && nums[i] == nums[i-1]) continue;
        while(j < k){
            int sum = nums[i] + nums[j] + nums[k];
            if(sum == 0){
            res.add(Arrays.asList(nums[i],nums[j],nums[k]));
            j++;
            k--;
            while(j < k && nums[j] == nums[j-1]) j++;
            }else if(sum < 0) j++;
            else k--;

        }
       }
       return res;
    }
}