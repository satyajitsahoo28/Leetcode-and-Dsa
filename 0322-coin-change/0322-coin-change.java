class Solution {
    public int f(int ind,int tar,int[] coins,int[][] dp){
        if(ind==0){
            if(tar % coins[0] ==0) {
                return tar/coins[0];
            } else{
                return (int)1e9;
            }
        }
        if(ind<0) return (int)1e9;
        
        if(dp[ind][tar]!=-1) return dp[ind][tar];
        int take=(int)1e9;
        if(coins[ind]<=tar){
            take=1+f(ind,tar-coins[ind],coins,dp);
        }
        int nottake=f(ind-1,tar,coins,dp);

        return dp[ind][tar]=Math.min(take,nottake);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=amount;j++){
                dp[i][j]=-1;
            }
        }
        int ans=f(coins.length-1,amount,coins,dp);
        if(ans==(int)1e9){
            return -1;
        }
        return ans;
    }
}