class Solution {
    public int trap(int[] height) {
        // int prefix[]=new int[height.length];
        // int suffix[]=new int[height.length];

        // int max=height[0];
        // for(int i=0;i<prefix.length;i++){
        //     prefix[i]=Math.max(max,height[i]);
        //     max=prefix[i];
        // }

        // max=height[height.length-1];
        // for(int i=suffix.length-1;i>=0;i--){
        //     suffix[i]=Math.max(height[i],max);
        //     max=suffix[i];
        // }
        // int trap=0;
        // for(int i=0;i<height.length;i++){
        //       trap =trap+ Math.min(prefix[i], suffix[i]) - height[i];
            
        // }

        // return trap;

        int left=0;
        int right=height.length-1;
        int leftMax=0;
        int rightMax=0;
        int res=0;

        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>leftMax){
                    leftMax=height[left];
                }
                else{
                    res+=leftMax-height[left];
                }
                left++;
            }

            else{
                if(height[right]>rightMax){
                    rightMax=height[right];
                }
                else{
                    res+=rightMax-height[right];
                }
                right--;
            }
        }

        return res;
        
    }
}