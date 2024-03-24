class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char str[]=s.toCharArray();

        for(int i=0;i<str.length;i++){
            map.put(str[i],map.getOrDefault(str[i],0)+1);
        }

        for(int i=0;i<str.length;i++){
            if(map.get(str[i])==1){
                return i;
            }
        }

        return -1;
        
    }
}