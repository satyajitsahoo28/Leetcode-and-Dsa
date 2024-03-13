class Solution {
    public int missingNumber(int[] nums) {
        int temp[]=new int[nums.length+1];

        for(int i=0;i<nums.length;i++){
            temp[nums[i]]++;
        }
        
        int num=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]==0){
                num=i;
            }
        }

        return num;
        
    }
}