class Solution {
    int bfs(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int src){
        Queue<Integer> q=new LinkedList<>();
        vis[src]=true;
        q.add(src);
        int n=0,e=0;
        while(!q.isEmpty()){
            int node=q.remove();
            n++;

            for(int it:adj.get(node)){
                e++;
                if(!vis[it]){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        int tolEdge=n*(n-1)/2;
            if(tolEdge!=e/2){
                return 1;
            }
            return 0;

    }
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[]=new boolean[n];
        int cnt=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                cnt++;
               ans+=bfs(adj,vis,i);
            }
        }
        return cnt-ans;
        
    }
}