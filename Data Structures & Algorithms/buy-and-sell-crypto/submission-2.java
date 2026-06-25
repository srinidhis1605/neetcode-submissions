class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r = 1;
        int maxp=0;
        while (r < prices.length){
            if(prices[r]>prices[l]){
                int profit = prices[r]-prices[l];
                maxp = Math.max(profit,maxp);
            }
            else{
                l=r;
            }
            r++;
        }
        return maxp;
    }
}
