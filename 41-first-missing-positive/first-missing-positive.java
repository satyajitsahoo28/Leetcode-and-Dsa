class Solution {
    public int firstMissingPositive(int[] nums) {
       int n=nums.length;
       int count=0;
       for(int i=0;i<n;i++){
        if(nums[i]==1){
            count++;
        }
       }

       if(count==0){
        return 1;
       }

       for(int i=0;i<n;i++){
        if(nums[i]<=0 || nums[i]>n){
            nums[i]=1;
        }
       }

       for(int i=0;i<n;i++){
        int curr=Math.abs(nums[i]);
        if(nums[curr-1]>0){
            nums[curr-1]=-1*nums[curr-1];
        }
       }

       for(int i=0;i<n;i++){
        if(nums[i]>0){
            return i+1;
        }
       }
       return n+1;
    }
}