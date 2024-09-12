class Solution {
    public int houseRobberRec(int ind, int[] nums){
        if(ind<0) return 0;
        if(ind==0) return nums[0];

        int robHouse = nums[ind] + houseRobberRec(ind-2, nums);
        int not_robHouse = 0 + houseRobberRec(ind-1, nums);

        return Math.max(robHouse, not_robHouse);
    }
    public int houseRobberMemo(int ind, int[] nums, int[] dp) {
         if (ind == 0) return nums[0];
        if (ind < 0) return 0;
       
        
        if (dp[ind] != -1) return dp[ind];
        
        int robHouse = nums[ind] + houseRobberMemo(ind - 2, nums, dp);
        int notRobHouse = houseRobberMemo(ind - 1, nums, dp);
        
        return dp[ind] = Math.max(robHouse, notRobHouse);
    }
    
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        
         //houseRobberRec(nums.length - 1, nums);  
        
        return houseRobberMemo(nums.length - 1, nums, dp);  
    }
}