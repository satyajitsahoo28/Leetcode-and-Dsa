class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;

        int n=nums.length;
        while(i<n && j<n){
            if(nums[i]==nums[j]){
                j++;
            }

            else if(nums[i]!=nums[j]){
                i=i+1;
                nums[i]=nums[j];
            }
        }

        return i+1;
        
    }
}