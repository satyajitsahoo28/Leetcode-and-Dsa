class Solution {
    
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int even[]=new int[(n+1)/2];
        int odd[]=new int[n/2];

        int idxEven=0;
        int idxOdd=0;

        for(int i=0;i<n;i++){
            if(i%2==0){
                even[idxEven++]=nums[i];
            }
            else{
                odd[idxOdd++]=nums[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        idxEven=0;
        idxOdd=n/2-1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=even[idxEven++];
            }
            else{
                nums[i]=odd[idxOdd--];
            }
        }

        return nums;

        
    }
}