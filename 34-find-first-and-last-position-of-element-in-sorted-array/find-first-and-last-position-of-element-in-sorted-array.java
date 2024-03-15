class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftIdx=-1;
        int rightIdx=-1;
        int ans[]=new int[2];

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                leftIdx=i;
                break;
            }
        }

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                rightIdx=i;
                break;
            }
        }

        ans[0]=leftIdx;
        ans[1]=rightIdx;

        return ans;

        
    }
}