class Solution {
    public int findPeakElement(int[] nums) {
        int arr[]=new int[nums.length+2];
        arr[0]=Integer.MIN_VALUE;
        arr[arr.length-1]=Integer.MIN_VALUE;
        for(int i=1;i<=nums.length;i++){
            arr[i]=nums[i-1];
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                return i-1;
            }
        }
        return 0;
    }
}