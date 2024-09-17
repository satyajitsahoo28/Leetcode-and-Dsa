class Solution {
    public void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;

        while(i<=j){
            if(nums[i]==val){
                if(nums[j]==val){
                    j--;
                }else{
                    swap(i,j,nums);
                    i++;
                    j--;
                }
            } else{
                i++;
            }
        }
        return i;
    }
}