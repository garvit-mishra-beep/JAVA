/*
Problem: Happy Number
Category: Math, Hashing
Difficulty: Easy
Approach: Floyd's Cycle Finding (Tortoise and Hare) or Set tracking
Time Complexity: O(log N)
Space Complexity: O(1)
*/

class HappyNumber_LC202 {

    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do {

            slow = squareSum(slow);

            fast = squareSum(squareSum(fast));

        } while (slow != fast);

        return slow == 1;
    }

    private int squareSum(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum += digit * digit;

            n /= 10;
        }

        return sum;
    }
}