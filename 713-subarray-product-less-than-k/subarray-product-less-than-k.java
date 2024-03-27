class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int left=i;
            int product=1;

            while(left>=0 && product<k){
                product*=nums[left];
                if(product<k){
                    count++;
                }
                left--;
            }
        }
        return count;
        
    }
}