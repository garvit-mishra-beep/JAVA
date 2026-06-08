/*
Problem: Plus One
Category: Arrays, Math
Difficulty: Easy
Approach: Iterative digit increment with carry handling
Time Complexity: O(N)
Space Complexity: O(N)
*/

class PlusOne_LC66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
    }
}