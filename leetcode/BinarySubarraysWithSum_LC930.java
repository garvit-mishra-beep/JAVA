/*
Problem: Binary Subarrays With Sum
Category: Sliding Window, Prefix Sum
Difficulty: Medium
Approach: Sliding window atMost(S) - atMost(S-1)
Time Complexity: O(N)
Space Complexity: O(1)
*/

import java.util.*;
class BinarySubarraysWithSum_LC930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1);
        int currSum = 0, result = 0;
        for (int num : nums) {
            currSum += num;
            result += countMap.getOrDefault(currSum - goal, 0);
            countMap.put(currSum, countMap.getOrDefault(currSum, 0) + 1);
        }
        
        return result;
    }
}
