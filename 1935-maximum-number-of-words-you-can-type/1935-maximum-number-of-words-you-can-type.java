class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String words[]=text.split(" ");
        int cnt=words.length;
        for(String word:words){
            for(int i=0;i<brokenLetters.length();i++){
                char ch=brokenLetters.charAt(i);
                if(word.indexOf(ch)!=-1){
                    cnt--;
                    break;
                }
            
            }
        }
        return cnt;

    }
}