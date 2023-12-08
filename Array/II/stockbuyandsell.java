public class stockbuyandsell {
    public static int maxProfit(int[] prices) {
        
        int mini = prices[0];
        int maxprofit = 0;
        int curr_profit;

        for(int i = 1; i < prices.length; i++){
            curr_profit = prices[i]-mini;
            maxprofit = Math.max(maxprofit, curr_profit);
            mini = Math.min(mini, prices[i]);
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int prices[] = { 7,1,5,4,3,6};
        System.out.println(maxProfit(prices));
    }
}
