/*
Problem: Container With Most Water
Category: Two Pointers
Difficulty: Medium
Approach: Two pointers narrowing from boundaries
Time Complexity: O(N)
Space Complexity: O(1)
*/

class ContainerWithMostWater_LC11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right])
                     * (right - left);
            max = Math.max(max, area);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}