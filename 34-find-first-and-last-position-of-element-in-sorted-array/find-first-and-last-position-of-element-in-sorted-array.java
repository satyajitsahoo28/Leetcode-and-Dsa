class Solution {
    public int findLeftIdx(int[] nums,int target){
        int index=-1;
        int si=0;
        int ei=nums.length-1;

        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(nums[mid]==target){
                index=mid;
                ei=mid-1;
            }

            else if(nums[mid]>target){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return index;
    }

    public int findRightIdx(int[] nums,int target){
        int index=-1;
        int si=0;
        int ei=nums.length-1;

        while(si<=ei){
            int mid=si+(ei-si)/2;

            if(nums[mid]==target){
                index=mid;
                si=mid+1;

            }
            else if(nums[mid]>target){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        // int leftIdx=-1;
        // int rightIdx=-1;
        // int ans[]=new int[2];

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         leftIdx=i;
        //         break;
        //     }
        // }

        // for(int i=nums.length-1;i>=0;i--){
        //     if(nums[i]==target){
        //         rightIdx=i;
        //         break;
        //     }
        // }

        // ans[0]=leftIdx;
        // ans[1]=rightIdx;

        // return ans;
        
        int left=findLeftIdx(nums,target);
        int right=findRightIdx(nums,target);
        return new int[]{left,right};
        

        
    }
}