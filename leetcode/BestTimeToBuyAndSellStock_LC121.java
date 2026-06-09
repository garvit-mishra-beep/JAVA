/*
Problem: Best Time to Buy and Sell Stock
Category: Arrays, Dynamic Programming
Difficulty: Easy
Approach: One-pass tracking min price and max profit
Time Complexity: O(N)
Space Complexity: O(1)
*/

class BestTimeToBuyAndSellStock_LC121 {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}