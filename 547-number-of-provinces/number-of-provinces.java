class Solution {
    void dfs(List<List<Integer>> adj,boolean vis[],int src){
        vis[src]=true;
        for(Integer neigh:adj.get((src))){
            if(!vis[neigh]){
                dfs(adj,vis,neigh);
            }
        }
        
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }

        }
        boolean vis[]=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                count++;
                dfs(adj,vis,i);
            }
        }
        return count;
        
    }
}