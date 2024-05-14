class Solution {
    boolean dfs(List<List<Integer>> adj,boolean[] vis,int source,int destination){
        vis[source]=true;
        for(int it:adj.get(source)){
            if(it==destination){
                return true;
            }
            if(!vis[it]){
                if(dfs(adj,vis,it,destination)){
                    return true;
                }
            }
            
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length==0 && source==destination){
            return true;
        }
        List<List<Integer>> adj=new ArrayList<>();
        int maxVertex = 0; 
        for (int[] edge : edges) {
            maxVertex = Math.max(maxVertex, Math.max(edge[0], edge[1])); 
        }
        for (int i = 0; i <= maxVertex; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int s = edge[0];
            int d = edge[1];
            adj.get(s).add(d);
            adj.get(d).add(s);
        }
        boolean[] vis=new boolean[maxVertex+1];
        if(dfs(adj,vis,source,destination)){
            return true;
        }
    return false;
        
    }
}