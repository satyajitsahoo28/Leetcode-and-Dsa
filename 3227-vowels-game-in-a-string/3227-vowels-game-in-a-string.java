class Solution {
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public boolean doesAliceWin(String s) {
        int vowel=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                vowel++;
            }
        }

        if(vowel==0){
            return false;
        }else{
            return true;
        }
    
    }
}