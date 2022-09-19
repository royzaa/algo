package com.algo.array.maxProfit;

public class Solution {
    public int maxProfit(int[] prices) {
        int buy =prices[0];
        int sell = 0;

        int buyIndex=0;
        int sellIndex = 0;

        int margin = 0;

        for (int i=1; i< prices.length;i++) {
            if (buy > prices[i]) {
                buy = prices[i];
                buyIndex=i;
            }
            if (i >= buyIndex && prices[i] > buy && margin <= prices[i]-buy) {
                sell = prices[i];
                sellIndex=i;
            }

            if (sellIndex > buyIndex) {
                margin = sell-buy;
            }
        }

        return margin;
    }

}
