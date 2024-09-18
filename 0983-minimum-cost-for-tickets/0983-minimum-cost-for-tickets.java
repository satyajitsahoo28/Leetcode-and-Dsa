class Solution {
    public int f(int ind,int[] days,int[] cost,int n,int[] dp){
        if(ind>=n) return 0;

        if(dp[ind]!=-1) return dp[ind];

        //1 day pass
        int cost1=cost[0]+f(ind+1,days,cost,n,dp);

        //7 day pass
        int j=ind;
        int maxDay=days[ind]+7;
        while(j<n && days[j]<maxDay){
            j++;
        }
        int cost7=cost[1]+f(j,days,cost,n,dp);

        //30 day pass
        j=ind;
        maxDay=days[ind]+30;
        while(j<n && days[j]<maxDay){
            j++;
        }
        int cost30=cost[2]+f(j,days,cost,n,dp);

        return dp[ind]=Math.min(cost1,Math.min(cost7,cost30));
    }
    public int mincostTickets(int[] days, int[] costs) {
        int n=days.length;
        int[] dp=new int[366];
        Arrays.fill(dp,-1);
        return f(0,days,costs,n,dp);
    }
}