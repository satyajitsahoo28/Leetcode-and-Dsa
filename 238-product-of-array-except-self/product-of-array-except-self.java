class Solution {
    public int[] productExceptSelf(int[] nums) {
       int prefix[]=new int[nums.length];
       int suffix[]=new int[nums.length];

       for(int i=0;i<nums.length;i++){
        prefix[i]=1;
        suffix[i]=1;
       }
       prefix[0]=nums[0];
       for(int i=1;i<nums.length;i++){
        prefix[i]=prefix[i-1]*nums[i];
       }

       int n=nums.length-1;
       suffix[suffix.length-1]=nums[nums.length-1];
       for(int i=n-1;i>=0;i--){
         suffix[i]=suffix[i+1]*nums[i];
        }
       nums[0]=suffix[1];
       nums[nums.length-1]=prefix[nums.length-1-1];

       for(int i=1;i<nums.length-1;i++){
            nums[i]=prefix[i-1]*suffix[i+1];
       }
       return nums;
    }
}