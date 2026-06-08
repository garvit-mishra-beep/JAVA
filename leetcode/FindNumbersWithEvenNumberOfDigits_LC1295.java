/*
Problem: Find Numbers with Even Number of Digits
Category: Arrays
Difficulty: Easy
Approach: Check if string length of numbers is even
Time Complexity: O(N)
Space Complexity: O(1)
*/

class FindNumbersWithEvenNumberOfDigits_LC1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            String s = Integer.toString(i);
            if (s.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}