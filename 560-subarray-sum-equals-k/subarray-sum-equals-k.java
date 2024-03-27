class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int left=i;
            int sum=0;

            while(left>=0){
                sum+=nums[left];
                if(sum==k){
                    count++;
                }
                left--;
            }

        }
        return count;
    }
}