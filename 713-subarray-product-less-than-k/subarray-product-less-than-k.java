class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //Approach-1 with n^2
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int left=i;
        //     int product=1;

        //     while(left>=0 && product<k){
        //         product*=nums[left];
        //         if(product<k){
        //             count++;
        //         }
        //         left--;
        //     }
        // }
        // return count;

        //Approach-2 with n
        if(k<=1){
            return 0;
        }
        int left = 0, right = 0, product = 1, count = 0;
        int n = nums.length;

        while (right < n) {
            product *= nums[right];
            while (product >= k) product /= nums[left++];
            count += 1 + (right - left);
            right++;
        }

        return count;
        
    }
}