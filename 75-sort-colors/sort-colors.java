class Solution {

    public void swap(int[] nums,int si,int ei){
        while(si<=ei){
            int temp=nums[si];
            nums[si]=nums[ei];
            nums[ei]=temp;

            si++;
            ei--;
            
        }
    }
    public void sortColors(int[] nums) {

        int start=0;
        int mid=0;
        int end=nums.length-1;

        while(mid<=end){
            if(nums[mid]==0){
                swap(nums,start++,mid++);
            }

            else if(nums[mid]==1){
                mid++;
            }

            else if(nums[mid]==2){
                swap(nums,mid,end--);
            }
        }

    }
}