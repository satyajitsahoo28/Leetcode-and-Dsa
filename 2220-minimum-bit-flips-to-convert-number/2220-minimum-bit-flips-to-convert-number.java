class Solution {
    public int minBitFlips(int start, int goal) {
        int num=start^goal;

        int cnt=0;
        while(num>0){
            if(num%2==1){
                cnt++;
            }
            num/=2;
        }

        return cnt;
        
    }
}