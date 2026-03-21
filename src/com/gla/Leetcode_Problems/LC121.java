package com.gla.Leetcode_Problems;

public class LC121 {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                if(max_profit < diff) {
                    max_profit = diff;
                }
            }
        }
        return max_profit;
    }
}
