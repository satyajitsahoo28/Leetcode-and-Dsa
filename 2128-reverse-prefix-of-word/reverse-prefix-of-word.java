class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=-1;
        String ans="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
               idx=i;
               break;
            }
        }
        String reverse="";
        String leftWord="";
        if(idx!=-1){
            for(int i=idx;i>=0;i--){
                reverse+=word.charAt(i);
            }

            for(int i=idx+1;i<word.length();i++){
                leftWord+=word.charAt(i);
            }
        }
        else{
            return word;
        }
        return reverse+leftWord;
    }
}