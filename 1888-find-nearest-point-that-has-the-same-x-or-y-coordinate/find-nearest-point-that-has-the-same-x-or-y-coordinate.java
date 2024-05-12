class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<points.length;i++){
            if(x==points[i][0] || y==points[i][1]){
                int dis=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                if(ans>dis){
                    ans=dis;
                    idx=i;
                }
            }
        }

        return idx;
        
    }
}