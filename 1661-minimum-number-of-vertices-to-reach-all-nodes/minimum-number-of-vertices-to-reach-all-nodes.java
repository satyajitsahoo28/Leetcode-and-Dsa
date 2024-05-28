class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.size();i++){
            int u=edges.get(i).get(0);
            int v=edges.get(i).get(1);
            adj.get(u).add(v);
        }
        int inDegree[]=new int[n];
        for(int i=0;i<n;i++){
            for(int it:adj.get(i)){
                inDegree[it]++;
            }
        }
        int cnt=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(inDegree[i]==0){
                list.add(i);
            }
        }
        
        return list;
        
    }
}