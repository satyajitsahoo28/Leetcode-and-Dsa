class Solution {
    public int largest(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    public long countSubarrays(int[] nums, int k) {
        int max=largest(nums);
        int left=0;
        int right=0;
        int count=0;
        long ans=0;

        while(right<nums.length){
            if(nums[right]==max){
                count++;
            }

            while(count>=k){
                ans+=nums.length-right;
                if(nums[left]==max){
                    count--;
                }
                left++;
            }
            right++;
        }
        return ans;
    }
}