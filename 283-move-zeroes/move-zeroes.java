class Solution {
    public void moveZeroes(int[] nums) {
       int temp[]=new int[nums.length];
       int si=0;
       int ei=nums.length-1;
       int i=0;

       while(si<=ei && i<nums.length){
        if(nums[i]==0){
            temp[ei]=nums[i];
            i++;
            ei--;
        }
        else{
            temp[si]=nums[i];
            i++;
            si++;
        }

       }
       for(int j=0;j<nums.length;j++){
        nums[j]=temp[j];
       }

    }
}