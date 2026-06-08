/*
Problem: Two Sum
Category: Arrays, Hashing
Difficulty: Easy
Approach: One-pass HashMap lookup
Time Complexity: O(N)
Space Complexity: O(N)
*/

import java.util.*;
class TwoSum_LC1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if(map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}