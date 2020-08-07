class Solution {
    public int maxProfit(int[] prices) {
        int maxprofix = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                maxprofix += prices[i] - prices[i-1];
            }
        }
        return maxprofix;
    }
}