class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxArea=0;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int w=j-i;
            maxArea=Math.max(maxArea,h*w);

            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }

        return maxArea;
    }
}