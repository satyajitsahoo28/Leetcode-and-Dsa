class Pair{
    int node;
    int original;

    Pair(int node,int original){
        this.node=node;
        this.original=original;
    }
}
class Solution {
    int ans=0;
    void dfs(ArrayList<ArrayList<Pair>> adj,boolean[] vis,int src){
        vis[src]=true;
        for(Pair p:adj.get(src)){
            if(!vis[p.node]){
                if(p.original==1){
                    ans++;
                }
                dfs(adj,vis,p.node);
            }
        }

    }
    public int minReorder(int n, int[][] connections) {
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<connections.length;i++){
            int u=connections[i][0];
            int v=connections[i][1];
            adj.get(u).add(new Pair(v,1));
            adj.get(v).add(new Pair(u,0));
        }
        boolean vis[]=new boolean[n];
        ans=0;
        dfs(adj,vis,0);
        return ans;
    }
}