class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashMap<String,List<Integer>> adj=new HashMap<>();
        int n=recipes.length;
        HashSet<String> set=new HashSet<>();
        for(String s:supplies){
            set.add(s);
        }
        int inDegree[]=new int[n];

        for(int i=0;i<n;i++){
            for(String str:ingredients.get(i)){
                if(!set.contains(str)){
                    adj.putIfAbsent(str,new ArrayList<>());
                    adj.get(str).add(i);
                    inDegree[i]++;
                }
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }

        List<String> result=new ArrayList<>();

        while(!q.isEmpty()){
            int idx=q.remove();
            result.add(recipes[idx]);
            if(adj.containsKey(recipes[idx])){
                for(int i:adj.get(recipes[idx])){
                    inDegree[i]--;
                    if(inDegree[i]==0){
                       q.add(i);
                    }
                }
            }
        }
        return result;
    }
}