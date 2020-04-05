class Solution {
   public int maxProfit(int[] prices) {
        int ret = 0;
        for (int i = 1; i < prices.length; i++) {
            ret += prices[i] - prices[i-1] > 0 ? prices[i] - prices[i-1]: 0;
        }
        return ret;
    }
}
