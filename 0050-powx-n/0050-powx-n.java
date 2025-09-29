class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        boolean flag1 = (x<0)? true:false;
        boolean flag2 = (n<0)? true:false;
        double ans = solve(Math.abs(x), Math.abs(n));
        
        if(flag2){
            ans= 1/ans;
        }
        
        if(flag1 && Math.abs(n)%2!=0){
            ans*=-1;
        }
        
        return ans;
    }
    public double solve(double b, int e) {
         if(e==0) return 1;
        if(e==1) return b;
        
        double ans = solve(b,e/2);
        if(e%2==0){
            return ans*ans;
        }else{
            return b*ans * ans;
        }
        
        
    }
}