/*
Problem: Guess Number Higher or Lower
Category: Binary Search
Difficulty: Easy
Approach: Binary search based on guess api
Time Complexity: O(log N)
Space Complexity: O(1)
*/

public class GuessNumberHigherOrLower_LC374 extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int result = guess(mid);
            if (result == 0) {
                return mid; 
            } else if (result == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return start;
    }
}