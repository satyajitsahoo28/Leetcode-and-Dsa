class Solution {
    int parent[];
    int rank[];

    public int findParent(int u){
        if(u==parent[u]){
            return u;
        }
        return parent[u]=findParent(parent[u]);
    }

    public void union(int u,int v){
        int par_u=findParent(u);
        int par_v=findParent(v);

        if(par_u!=par_v){
            if(rank[par_u]>rank[par_v]){
                parent[par_u]=parent[par_v];
            }else if(rank[par_u]<rank[par_v]){
                parent[par_v]=parent[par_u];
            }else{
                parent[par_u]=parent[par_v];
                rank[par_u]++;
            }
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length+1;
        parent=new int[n];
        rank=new int[n];

        for(int i=1;i<n;i++){
            parent[i]=i;
            rank[i]=1;
        }

        int[] ans=new int[2];
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];

            int par_u=findParent(u);
            int par_v=findParent(v);

            if(par_u==par_v){
                ans[0]=u;
                ans[1]=v;
            }else{
                union(u,v);
            }
        }
        return ans;
    }
}