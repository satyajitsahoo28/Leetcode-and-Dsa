class Solution {
    public void moveZeroes(int[] nums) {
    //    int temp[]=new int[nums.length];
    //    int si=0;
    //    int ei=nums.length-1;
    //    int i=0;

    //    while(si<=ei && i<nums.length){
    //     if(nums[i]==0){
    //         temp[ei]=nums[i];
    //         i++;
    //         ei--;
    //     }
    //     else{
    //         temp[si]=nums[i];
    //         i++;
    //         si++;
    //     }

    //    }
    //    for(int j=0;j<nums.length;j++){
    //     nums[j]=temp[j];
    //    }

    int i=0;
    int j=0;

    while(i<nums.length && j<nums.length){
        if(nums[j]==0){
            j++;
        }

        else if(nums[j]!=0 && nums[i]==0){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
        }

        else{
            i++;
            j++;
        }
    }

    }
}