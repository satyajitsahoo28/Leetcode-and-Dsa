class Solution {
    public int reverse(int x) {
        int num=Math.abs(x);
        int ans=0;
        while(num>0){
            int rem=num%10;
             if(ans<Integer.MIN_VALUE/10 || ans>Integer.MAX_VALUE/10){
                 return 0;
             }
            ans=ans*10+rem;
            num/=10;
           
        
        }

        if(x<0){
            return -1*ans;
        }
        return ans;
        
    }
}