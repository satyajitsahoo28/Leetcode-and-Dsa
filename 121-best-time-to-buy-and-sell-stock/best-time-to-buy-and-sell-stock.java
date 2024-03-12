class Solution {
    public int maxProfit(int[] prices) {

        int buyPrice=Integer.MAX_VALUE;
        int sellPrice=0;
        int profit=0;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            buyPrice=Math.min(buyPrice,prices[i]);
            sellPrice=prices[i];

            profit=sellPrice-buyPrice;
            maxProfit=Math.max(maxProfit,profit);


        }

        return maxProfit;
        
    }
}