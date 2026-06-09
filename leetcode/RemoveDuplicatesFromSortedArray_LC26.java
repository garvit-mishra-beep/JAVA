/*
Problem: Remove Duplicates from Sorted Array
Category: Two Pointers
Difficulty: Easy
Approach: Two pointers tracking unique insertions
Time Complexity: O(N)
Space Complexity: O(1)
*/

import java.util.*;
class RemoveDuplicatesFromSortedArray_LC26 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j< nums.length;j++)
        {
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
        
    }
}   