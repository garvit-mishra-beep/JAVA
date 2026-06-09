/*
Problem: Longest Substring Without Repeating Characters
Category: Strings, Sliding Window
Difficulty: Medium
Approach: Sliding window with character index tracking
Time Complexity: O(N)
Space Complexity: O(min(A, M))
*/

class LongestSubstringWithoutRepeatingCharacters_LC3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}