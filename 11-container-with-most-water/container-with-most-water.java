class Solution {
    public int maxArea(int[] height) {
        int si=0;
        int ei=height.length-1;
        int maxWater=0;

        while(si<ei){
             int h=Math.min(height[si],height[ei]);
             int w=ei-si;
             int water=h*w;
             maxWater=Math.max(maxWater,water);

            if(height[si]<=height[ei]){
                si++;
            }
            else{
                ei--;
            }
        }
        return maxWater;
    }

}