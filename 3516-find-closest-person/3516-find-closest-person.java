class Solution {
    public int findClosest(int x, int y, int z) {
        int ans =0;
        int stepOfPer1=Math.abs(z-x);
        int stepOfPer2=Math.abs(z-y);
        if(stepOfPer1<stepOfPer2){
            return 1;
        }else if(stepOfPer1>stepOfPer2){
            return 2;
        }
        return 0;
    }
}