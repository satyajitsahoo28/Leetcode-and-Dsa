class Solution {
    public int findMax(int[] nums){
        int maxNum=Integer.MIN_VALUE;
        for(int num:nums){
            if(maxNum<num){
                maxNum=num;
            }
        }
        return maxNum;
    }
    public int firstMissingPositive(int[] nums) {
        int maxNum=findMax(nums);
        if(maxNum<0) return 1;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=1;i<=maxNum;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return maxNum+1;
    }
}