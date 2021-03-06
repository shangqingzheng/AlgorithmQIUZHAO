public class Solution {
	//暴力求解
	public int maxProfit(int prices[]) {
		int maxprofit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				int profit = prices[j] - prices[i];
				if (profit > maxprofit) {
					maxprofit = profit;
				}
			}
		}
		return maxprofit;
	}
}

public class Solution {
	//动态规划
	public int maxProfit(int prices[]) {
		if (prices.length == 0) return 0;
		int buy = proces[0], profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] <= buy) {
				buy = prices[i];
			} else if (prices[i] - buy > profit) {
				profit = prices[i] - buy;
			}
		}
		return profit;
	}
}