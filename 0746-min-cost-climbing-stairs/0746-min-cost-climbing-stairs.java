class Solution {
    int f(int idx,int[] cost,int n,int dp[]){
        if(idx>=n) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int left=cost[idx]+f(idx+1,cost,n,dp);
        int right=cost[idx]+f(idx+2,cost,n,dp);

        return dp[idx]=Math.min(left,right);
    }
    public int minCostClimbingStairs(int[] cost) {
         int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int result = Math.min(f(0, cost, n, dp), f(1, cost, n, dp));
        return result;
    }
}