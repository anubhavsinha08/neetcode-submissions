class Solution {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int buy = Integer.MAX_VALUE;
        int ans=0;
        
        for(int i=0;i<prices.length;i++){
            buy = Math.min(buy,prices[i]);
            profit =Math.max(profit,prices[i]-buy);
            if(profit>0){
                ans+=profit;
                buy=prices[i];
                profit = Integer.MIN_VALUE;
            }
        }
        return ans;
    }
}