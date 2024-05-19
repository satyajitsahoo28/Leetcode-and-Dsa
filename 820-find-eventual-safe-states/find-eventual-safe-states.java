// class Solution {
//     boolean isCycle(int[][] graph,int[] vis,int[] path,int[] check,int src){
//         vis[src]=1;
//         path[src]=1;
//         check[src]=0;
//         for(int it:graph[src]){
//             if(vis[it]==0){
//                 if(isCycle(graph,vis,path,check,it)==true){
//                     return true;
//                 }
//             }
//             else if(path[it]==1){
//                 return true;
//             }
//         }
//         path[src]=0;
//         check[src]=1;
//         return false;
//     }

//     public List<Integer> eventualSafeNodes(int[][] graph) {
//         int v=graph.length;
//         ArrayList<Integer> list=new ArrayList<>();
//         int vis[]=new int[v];
//         int path[]=new int[v];
//         int check[]=new int[v];
//         for(int i=0;i<v;i++){
//            if(vis[i]==0){
//              isCycle(graph,vis,path,check,i);
//            }
//         }
//         for(int i=0;i<v;i++){
//             if(check[i]==1){
//                 list.add(i);
//             }
//         }
//         return list;
        
//     }
// }

//using topological sort
class Solution{
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adjRev=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adjRev.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int it:graph[i]){
                adjRev.get(it).add(i);
            }
        }

        int inDegree[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int it:adjRev.get(i)){
                inDegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        List<Integer> result=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.remove();
            result.add(node);
            for(int it:adjRev.get(node)){
                inDegree[it]--;
                if(inDegree[it]==0){
                    q.add(it);
                }
            }
        }

        Collections.sort(result);
        return result;
    }

}