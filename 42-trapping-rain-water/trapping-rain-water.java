class Solution {
    public int trap(int[] height) {
        int prefix[]=new int[height.length];
        int suffix[]=new int[height.length];

        int max=height[0];
        for(int i=0;i<prefix.length;i++){
            prefix[i]=Math.max(max,height[i]);
            max=prefix[i];
        }

        max=height[height.length-1];
        for(int i=suffix.length-1;i>=0;i--){
            suffix[i]=Math.max(height[i],max);
            max=suffix[i];
        }
        int trap=0;
        for(int i=0;i<height.length;i++){
              trap =trap+ Math.min(prefix[i], suffix[i]) - height[i];
            
        }

        return trap;
        
    }
}