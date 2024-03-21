class Solution {
    public int findPeakElement(int[] nums) {
        int i=0;
        int j=nums.length-1;

        while(i<=j){
            int mid=i+(j-i)/2;
            int left=mid-1==-1?Integer.MIN_VALUE:nums[mid-1];
            int right=mid+1==nums.length?Integer.MIN_VALUE:nums[mid+1];

            if(nums[mid]>left && nums[mid]>right){
                return mid;
            }
            else if(nums[mid]<right){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return 0;
        
        
    }
}