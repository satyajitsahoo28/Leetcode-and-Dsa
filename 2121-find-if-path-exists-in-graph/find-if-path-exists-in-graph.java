class Solution {
    boolean dfs(List<List<Integer>> adj,int[] vis,int[] path,int node,int source,int destination){
        vis[node]=1;
        path[node]=1;
        for(int it:adj.get(node)){
            if(it!=destination && vis[it]==0){
                if(dfs(adj,vis,path,it,source,destination)){
                    return true;
                }
            }
            else if(it==destination && path[source]==1){
                return true;
            }
        }
        path[node]=0;
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
        int[] vis=new int[maxVertex+1];
        int[] path=new int[maxVertex+1];

        for(int i=source;i<=maxVertex;i++){
            if(vis[i]==0){
                if(dfs(adj,vis,path,i,source,destination)){
                    return true;
                }
            }
        }
    return false;
        
    }
}