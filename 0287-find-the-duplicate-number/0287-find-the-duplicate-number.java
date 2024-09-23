class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int absval=Math.abs(nums[i]);
            if(nums[absval-1]>0){
                nums[absval-1]=-nums[absval-1];
            } else{
                return absval;
            }
        }
        return -1;
    }
}