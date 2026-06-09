/*
Problem: Intersection of Two Arrays
Category: Arrays, Hashing
Difficulty: Easy
Approach: Two HashSets to track intersection
Time Complexity: O(N+M)
Space Complexity: O(N+M)
*/

import java.util.*;
class IntersectionOfTwoArrays_LC349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }
        for (int n : nums2) {
            if (set.contains(n)) {
                ans.add(n);
            }
        }
        int[] result = new int[ans.size()];
        int i = 0;
        for (int n : ans) {
            result[i++] = n;
        }
        return result;
    }
}