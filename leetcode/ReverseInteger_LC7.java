/*
Problem: Reverse Integer
Category: Math
Difficulty: Medium
Approach: Digit extraction with overflow checks
Time Complexity: O(log10(N))
Space Complexity: O(1)
*/

class ReverseInteger_LC7 {

    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            int digit = x % 10;

            if (rev > Integer.MAX_VALUE / 10 || 
                rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;

            x = x / 10;
        }

        return rev;
    }
}