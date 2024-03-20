class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

        for(String str:strs){
            char arr[]=str.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            // List<String> list = map.getOrDefault(key, new ArrayList<>());
            // list.add(str);
            // map.put(key, list);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
        
    }
}