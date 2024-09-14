class Solution {
    public int longestSubarray(int[] nums) {
        int maxNum=Integer.MIN_VALUE;
        int ans=0;
        int streak=0;
        for(int num:nums){
            if(maxNum<num){
                maxNum=num;
                ans=0;
                streak=0;
            }

            if(maxNum==num){
                streak++;
            } else{
                streak=0;
            }

            ans=Math.max(ans,streak);
        }

        return ans;
    }
}