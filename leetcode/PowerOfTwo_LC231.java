/*
Problem: Power of Two
Category: Math, Bit Manipulation
Difficulty: Easy
Approach: Check if (n & (n - 1)) == 0
Time Complexity: O(1)
Space Complexity: O(1)
*/

class PowerOfTwo_LC231 {

    public boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }
}