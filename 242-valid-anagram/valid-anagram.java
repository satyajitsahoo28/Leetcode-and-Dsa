class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        // char str1[]=s.toCharArray();
        // Arrays.sort(str1);
        // char str2[]=t.toCharArray();
        // Arrays.sort(str2);

        // for(int i=0;i<str1.length;i++){
        //     if(str1[i]!=str2[i]){
        //         return false;
        //     }
        // }

        // return true;

        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }

        return true;

        
        
    }
}