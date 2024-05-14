class Solution {
    boolean dfs(List<List<Integer>> adj,boolean[] vis,int source,int destination){
        vis[source]=true;
        for(int it:adj.get(source)){
            if(it==destination){
                return true;
            }
            else if(!vis[it]){
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
        for (int i = 0; i < n; i++) {
      adj.add(new ArrayList<>());
    }

    for (int[] edge : edges) {
      int s = edge[0];
      int d = edge[1];
      adj.get(s).add(d);
      adj.get(d).add(s); 
    }

    boolean[] vis = new boolean[n];
    return dfs(adj, vis, source, destination);
        
    }
}