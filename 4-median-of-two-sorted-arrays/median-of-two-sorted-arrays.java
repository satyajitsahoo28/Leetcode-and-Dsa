class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int temp[]=new int[m+n];
        int i=m-1;
        int j=n-1;
        int k=temp.length-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                temp[k--]=nums1[i--];
            }
            else{
                temp[k--]=nums2[j--];
            }
        }

        while(i>=0){
            temp[k--]=nums1[i--];
        }

        while(j>=0){
            temp[k--]=nums2[j--];
        }

        int size=temp.length;
        double median;
        if(size%2==0){
            int step1=size/2;
            int step2=(step1+1);
            median=(temp[step1-1]+temp[step2-1])/2.0;
        }
        else{
            median=temp[(size+1)/2-1];
        }

        return median;

        
    }
}