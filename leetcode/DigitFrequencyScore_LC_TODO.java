/*
Problem: Digit Frequency Score
Category: Hashing
Difficulty: Easy
Approach: Character mapping with count logic
Time Complexity: O(N)
Space Complexity: O(N)
*/

class DigitFrequencyScore_LC_TODO {
    public int digitFrequencyScore(int n) {
        int sum =0;
        while(n>=1){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}