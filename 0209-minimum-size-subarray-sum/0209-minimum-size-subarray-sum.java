class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,len=Integer.MAX_VALUE,sum=0;

        while(j<nums.length) {
            sum+=nums[j];

            if(sum>=target) {
                len=Math.min(len,j-i+1);

                while(i<j && sum>target) {
                    sum-=nums[i];
                    i++;
                    if(sum>=target){
                        len=Math.min(len,j-i+1);
                    }
                }
            }
            j++;
        }
        return len==Integer.MAX_VALUE?0:len;

    }
}