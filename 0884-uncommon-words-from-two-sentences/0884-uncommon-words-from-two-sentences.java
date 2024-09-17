class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String str1[]=s1.split[" "];
        String str2[]=s2.split[" "];

        HashMap<String,Integer> map=new HashMap<>();

        for(String s:str1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        for(String s:str2){
            if(map.containsKey(s)){
                map.remove(s);
            }else{
                map.put(s,1);
            }
        }

        String[] result=new String[map.size()];
        int idx=0;
        for(Map.Entry<String,Integer> entry:map.hasSet()){
            if(entry.getValue()==1){
                String[idx++]=entry.getKey();
            }
        }

        return result;
    }
}