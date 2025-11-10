class Solution {
    int par[];
    int rank[];

    public int find(int u){
        if(u==par[u]){
            return u;
        }
        return par[u]=find(par[u]);
    }

    public void union(int u,int v){
        int par_u=find(u);
        int par_v=find(v);

        if(rank[par_u]>rank[par_v]){
            par[par_v]=par[par_u];
        }else if(rank[par_u]<rank[par_v]){
            par[par_u]=par[par_v];
        }else{
            rank[par_u]+=1;
            par[par_v]=par[par_u];
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        par=new int[n];
        rank=new int[n];
        for(int i=1;i<n;i++){
            par[i]=i;
            rank[i]=1;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    int u=i;
                    int v=j;

                    int par_u=find(u);
                    int par_v=find(v);

                    if(par_u!=par_v){
                        union(par_u,par_v);
                    }
                }
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(i==par[i]){
                cnt++;
            }
        }
        return cnt;
    }
}