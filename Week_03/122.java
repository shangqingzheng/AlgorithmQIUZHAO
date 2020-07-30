class Solution {
	//买卖股票最佳时机 -峰谷法
    public int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofix = 0;
        while (i < prices.length-1) {
            while (i < prices.length-1 && prices[i] >= prices[i+1]) {
                i++;
            }
            valley = prices[i];
            while (i < prices.length-1 && prices[i] <= prices[i+1]) {
                i++;
            }
            peak = prices[i];
            maxprofix = maxprofix + (peak - valley);
        }
        return maxprofix;
    }
    //买卖股票最佳时机 -简单的一次遍历 其实这也是贪心算法的思想
    public int maxProfitOne(int[] prices) {
        int maxprofix = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                maxprofix += prices[i] - prices[i-1];
            }
        }
        return maxprofix;
    }
}