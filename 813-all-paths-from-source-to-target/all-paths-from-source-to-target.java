class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(graph,ans,path,0);
        return ans;
        
    }

    void dfs(int[][] graph,List<List<Integer>> ans,List<Integer> path,int src){
        path.add(src);
        if(src==graph.length-1){
            ans.add(new ArrayList<>(path));
        }
        else{
            for(int i=0;i<graph[src].length;i++){
                dfs(graph,ans,path,graph[src][i]);
            }
        }
        path.remove(path.size()-1);
    }
}