class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int result[]=new int[queries.length];
        int idx=0;
        for(int[] num:queries){
            int xj=num[0];
            int yj=num[1];
            int r=num[2]*num[2];

            for(int[] num2:points){
                int xi=num2[0];
                int yi=num2[1];

                int dis=(int)(Math.pow(xj-xi,2)+Math.pow(yj-yi,2));
                if(dis<=r){
                    result[idx]++;
                }
            }
            idx++;
        }
        return result;
        
    }
}