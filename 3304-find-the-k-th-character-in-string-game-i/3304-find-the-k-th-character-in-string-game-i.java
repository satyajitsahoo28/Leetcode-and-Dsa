class Solution {
    public char kthCharacter(int k) {
        HashMap<Character,Character> nextChar=new HashMap<>();
        for(char ch='a';ch<'z';ch++){
            nextChar.put(ch,(char)(ch+1));
        }
        nextChar.put('z','a');
        StringBuilder sb=new StringBuilder();
        sb.append('a');
        while(sb.length()<=k){
            int len=sb.length();
            for(int i=0;i<len;i++){
                sb.append(nextChar.get(sb.charAt(i)));
            }
        }
        return sb.charAt(k-1);
    }
}