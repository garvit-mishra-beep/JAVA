/*
Problem: Check If N and Its Double Exist
Category: Arrays, Hashing
Difficulty: Easy
Approach: HashSet to store numbers and check 2n or n/2
Time Complexity: O(N)
Space Complexity: O(N)
*/

class CheckIfNAndItsDoubleExist_LC1346 {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (
                seen.contains(2 * num) ||
                (num % 2 == 0 && seen.contains(num / 2))
            ) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}