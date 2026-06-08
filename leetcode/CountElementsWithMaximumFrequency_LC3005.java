/*
Problem: Count Elements With Maximum Frequency
Category: Hashing
Difficulty: Easy
Approach: HashMap element counts tracking maximum freq
Time Complexity: O(N)
Space Complexity: O(N)
*/

class CountElementsWithMaximumFrequency_LC3005 {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int frequency = 0, count = 0;
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int val : freq.values()) {
            if (val == frequency) {
                count++;
            } else if (val > frequency) {
                frequency = val;
                count = 1;
            }
        }

        return frequency * count;
    }
}