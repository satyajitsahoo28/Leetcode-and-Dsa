class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=graph.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int src=0;
        int target=n-1;
        dfs(adj,src,target,list,temp);
        return list;  
    }
    void dfs(ArrayList<ArrayList<Integer>> adj,int src,int target,List<List<Integer>> list,List<Integer> temp){
        temp.add(src);
        if(src==target){
            list.add(new ArrayList<>(temp));
        }
        else{
           for(int it:adj.get(src)){
              dfs(adj,it,target,list,temp);
            }
        }
        int size=temp.size();
        temp.remove(size-1);
    }
}