class Solution {
    public int findDuplicate(int[] nums) {
        // int ans=0;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         ans=nums[i];
        //     }
        // }
        // return ans;

        int slow=0;
        int fast=0;

        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}