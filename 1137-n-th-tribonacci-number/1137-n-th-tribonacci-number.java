class Solution {

    int f(int n, int[] dp) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        if (dp[n] != -1) return dp[n];
        return dp[n] = f(n - 1, dp) + f(n - 2, dp) + f(n - 3, dp);
    }

    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        //return f(n,dp);
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        //return dp[n];

        int prev3=0;
        int prev2=1;
        int prev1=1;
        for(int i=3;i<=n;i++){
           int curr=prev1+prev2+prev3;
           prev3=prev2;
           prev2=prev1;
           prev1=curr; 
        }
        return prev1;
    }
}
