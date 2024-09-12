class Solution {
    int f(int idx,int dp[]){
        if(idx<0) return 0;
        if(idx==0) return 1;
        if(idx==1) return 1;
        if(dp[idx]!=-1) return dp[idx];
        int left=f(idx-1,dp);
        int right=f(idx-2,dp);
        return dp[idx]=left+right;
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
       return f(n,dp);
        
    }
}