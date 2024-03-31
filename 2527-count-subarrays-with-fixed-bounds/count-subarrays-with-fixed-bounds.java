class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
     long ans=0;
     int minPos=-1;
     int maxPos=-1;
     int culPritIdx=-1;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==minK){
            minPos=i;
        }
        if(nums[i]==maxK){
            maxPos=i;
        }
        if(nums[i]<minK || nums[i]>maxK){
            culPritIdx=i;
        }

        long smaller=Math.min(minPos,maxPos);
        long temp=smaller-culPritIdx;
        ans+=(temp<=0)?0:temp;
     }
     return ans;
    }
}