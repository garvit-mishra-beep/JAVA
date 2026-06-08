/*
Problem: Fizz Buzz
Category: Math, Simulation
Difficulty: Easy
Approach: Modulo conditional branches
Time Complexity: O(N)
Space Complexity: O(N)
*/

class FizzBuzz_LC412 {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(i%3 ==0 && i%5==0) {
                ans.add("FizzBuzz");
            }
            else if(i%3==0) {
                ans.add("Fizz");
            }
            else if(i%5==0) {
                ans.add("Buzz");
            }
            else {
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
}