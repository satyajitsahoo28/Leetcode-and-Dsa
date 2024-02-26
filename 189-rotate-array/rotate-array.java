class Solution {

    public void reverse(int[] nums,int si,int ei){
        while(si<=ei){
            int temp=nums[si];
            nums[si]=nums[ei];
            nums[ei]=temp;

            si++;
            ei--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        
    }
}