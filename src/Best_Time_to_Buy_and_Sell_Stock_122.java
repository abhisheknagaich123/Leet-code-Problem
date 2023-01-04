public class Best_Time_to_Buy_and_Sell_Stock_122 {
    public int maxProfit(int[] prices) {

        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                max_profit+= prices[i]-prices[i-1];
            }
        }
        return max_profit;
    }
}
