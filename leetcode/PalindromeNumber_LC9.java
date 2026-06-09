/*
Problem: Palindrome Number
Category: Math
Difficulty: Easy
Approach: Reversing the right half of the integer
Time Complexity: O(log10(N))
Space Complexity: O(1)
*/

class PalindromeNumber_LC9 {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int original = x;
        int reversed = 0;
        while(x > 0){
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }
}