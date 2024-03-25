class Solution {
    public void findLps(String needle,int[] lps){
        int prefix=0;
        int suffix=1;
        while(suffix<needle.length()){
            if(needle.charAt(prefix)==needle.charAt(suffix)){
                lps[suffix]=prefix+1;
                prefix++;
                suffix++;
            }
            else{
                if(prefix==0){
                    lps[suffix]=0;
                    suffix++;
                }
                else{
                    prefix=lps[prefix-1];
                }
            }
        }

    }
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        int lps[]=new int[needle.length()];
        findLps(needle,lps);
        int first=0;
        int second=0;

        while(first<haystack.length() && second<needle.length()){
            if(haystack.charAt(first)==needle.charAt(second)){
                first++;
                second++;
            }
            else{
                if(second==0){
                    first++;
                }
                else{
                    second=lps[second-1];
                }
            }
        }

        if(second==needle.length()){
            return first-second;
        }
        return -1;
        
    }
}