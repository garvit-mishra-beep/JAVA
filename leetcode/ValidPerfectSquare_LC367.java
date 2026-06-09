/*
Problem: Valid Perfect Square
Category: Binary Search
Difficulty: Easy
Approach: Binary search between 1 and num
Time Complexity: O(log N)
Space Complexity: O(1)
*/

class ValidPerfectSquare_LC367 {
    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        long left = 1;
        long right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
