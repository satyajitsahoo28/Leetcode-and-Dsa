class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<=1){
            return true;
        }
        int idx=0;
        int jumb=0;

        while(idx<nums.length && idx<=jumb){
            jumb=Math.max(jumb,idx+nums[idx]);
            idx++;

        }
        if(jumb>=nums.length-1){
            return true;
        }
        return false;
    }
}