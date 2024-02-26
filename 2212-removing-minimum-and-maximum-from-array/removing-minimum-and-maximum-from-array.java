class Solution {
    public int maximum(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        return max;
    }

    public int minimum(int[] nums){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
    public int minimumDeletions(int[] nums) {

        int max=maximum(nums);
        int min=minimum(nums);

        //condition 1
        int frontMaxStep1=0;
        int frontMinStep1=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                frontMaxStep1=(i+1);
                break;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==min){
                frontMinStep1=(i+1);
                break;
            }
        }

        int cond1=Math.max(frontMaxStep1,frontMinStep1);

        //condition 2
        int frontMaxStep2=0;
        int frontMinStep2=0;

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==max){
                frontMaxStep2=(nums.length-i);
                break;
            }
        }

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==min){
                frontMinStep2=(nums.length-i);
                break;
            }
        }

        int cond2=Math.max(frontMaxStep2,frontMinStep2);

        //condition 3

        int frontMaxStep3=Math.min(frontMaxStep1,frontMaxStep2);
        int frontMinStep3=Math.min(frontMinStep1,frontMinStep2);

        int cond3=frontMaxStep3+frontMinStep3;

        int result=Math.min(cond3,Math.min(cond1,cond2));

        return result;

        
    }
}