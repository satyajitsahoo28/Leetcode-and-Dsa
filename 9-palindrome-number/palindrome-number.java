class Solution {
    public int reverse(int x){
        int num=0;
        while(x>0){
            num=num*10 + x%10;
            x/=10;
        }
        return num;
    }
    public boolean isPalindrome(int x) {
        int n=reverse(x);

        return x==n?true:false;
        
    }
}