class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=-1;
        for(int i=0;i<nums.length;i++){
            int absNum=Math.abs(nums[i]);
            if(set.contains(-nums[i])){
                max=Math.max(absNum,max);
            }
            else{
                set.add(nums[i]);
            }
        }
        return max;
        
    }
}