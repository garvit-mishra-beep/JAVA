/*
Problem: Contains Duplicate II
Category: Hashing, Sliding Window
Difficulty: Easy
Approach: HashMap tracking element index distance
Time Complexity: O(N)
Space Complexity: O(min(N, K))
*/

class ContainsDuplicateII_LC219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);
            if(seen.size() > k) {
                seen.remove(nums[i - k]);
            }
        }
        return false;
    }
}