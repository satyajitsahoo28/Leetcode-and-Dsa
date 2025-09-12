class Solution {
    // public int findMax(int[] nums){
    //     int maxNum=Integer.MIN_VALUE;
    //     for(int num:nums){
    //         if(maxNum<num){
    //             maxNum=num;
    //         }
    //     }
    //     return maxNum;
    // }
    // public int firstMissingPositive(int[] nums) {
    //     int maxNum=findMax(nums);
    //     if(maxNum<0) return 1;
    //     HashSet<Integer> set=new HashSet<>();
    //     for(int num:nums){
    //         set.add(num);
    //     }
    //     for(int i=1;i<=maxNum;i++){
    //         if(!set.contains(i)){
    //             return i;
    //         }
    //     }
    //     return maxNum+1;
    // }
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean one=false;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                one=true;
            }

            if(nums[i]<=0 || nums[i]>n){
                nums[i]=1;
            }
        }

        if(one==false) return 1;

        for(int i=0;i<n;i++){
            int num=Math.abs(nums[i]);
            int idx=num-1;

            if(nums[idx]<0) continue;
            nums[idx]*=-1;
        }

        for(int i=0;i<n;i++){
            if(nums[i]>0) return i+1;
        }

        return n+1;
    }
}