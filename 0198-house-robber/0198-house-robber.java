class Solution {

    public int houseRobberRec(int ind, int[] nums) {
        if (ind < 0) return 0;
        if (ind == 0) return nums[0];

        int robHouse = nums[ind] + houseRobberRec(ind - 2, nums);
        int not_robHouse = 0 + houseRobberRec(ind - 1, nums);

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
        //Recursion
        //houseRobberRec(nums.length - 1, nums);

        int[] dp = new int[nums.length];
        //memoziztion
        // Arrays.fill(dp, -1);
        // return houseRobberMemo(nums.length - 1, nums, dp);

        //tabulation
        Arrays.fill(dp, 0);
        dp[0] = nums[0];
        for (int ind = 1; ind < nums.length; ind++) {
            int robHouse = nums[ind];
            if (ind  > 1) {
                robHouse = dp[ind - 2];
            }
            int notRobHouse = dp[ind - 1];

            dp[ind] = Math.max(robHouse, notRobHouse);
        }

        return dp[dp.length - 1];
    }
}
