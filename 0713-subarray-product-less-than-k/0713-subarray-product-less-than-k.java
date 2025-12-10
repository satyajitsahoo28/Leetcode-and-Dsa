class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=0,prod=1,cnt=0;

        while(j<n){
            prod*=nums[j];

            while(i<j && prod>=k){
                prod/=nums[i];
                i++;
            }

            if(prod<k){
                cnt+=(j-i+1);
            }
            j++;
        }
        return cnt;
    }
}