class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            map.put(u,map.getOrDefault(u,0)+1);
            map.put(v,map.getOrDefault(v,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==edges.length){
                return entry.getKey();
            }
        }
        return -1;
        
    }
}