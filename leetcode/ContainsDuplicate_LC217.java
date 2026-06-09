/*
Problem: Contains Duplicate
Category: Hashing, Arrays
Difficulty: Easy
Approach: HashSet to track visited elements
Time Complexity: O(N)
Space Complexity: O(N)
*/

import java.util.*;
class ContainsDuplicate_LC217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(nums).anyMatch(n -> !set.add(n));
    }
}