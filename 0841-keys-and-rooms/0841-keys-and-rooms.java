class Solution {
    public void dfs(int node,boolean[] vis,List<List<Integer>> adj){
        vis[node]=true;
        for(int it:adj.get(node)){
            if(!vis[it]){
                dfs(it,vis,adj);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis=new boolean[rooms.size()];
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<rooms.size();i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<rooms.size();i++){
            for(int j=0;j<rooms.get(i).size();j++){
                int u=rooms.get(i).get(j);
                if(u!=i){
                    adj.get(i).add(u);
                }
            }
        }

        dfs(0,vis,adj);
        for(int i=0;i<rooms.size();i++){
            if(vis[i]==false) return false;
        }

        return true;
    }
}