class Solution {
    public boolean validPalindrome(String s) {
        // int lps[]=new int[s.length()];
        // int prefix=0;
        // int suffix=1;
        // while(suffix<s.length()){
        //     if(s.charAt(prefix)==s.charAt(suffix)){
        //         lps[suffix]=prefix+1;
        //         prefix++;
        //         suffix++;
        //     }
        //     else{
        //         if(prefix==0){
        //             lps[suffix]=0;
        //             suffix++;
        //         }
        //         else{
        //             prefix=lps[prefix-1];
        //         }
        //     }
        // }

        // if(lps[lps.length-1]>0){
        //     return true;
        // }
        // return false;
        int si=0;
        int ei=s.length()-1;
        while(si<=ei){
            if(s.charAt(si)==s.charAt(ei)){
                si++;
                ei--;
            }
            else{
                return validPailndromeUtil(s,si+1,ei) || validPailndromeUtil(s,si,ei-1);
            }
        }
        return true;

    }

    public boolean validPailndromeUtil(String s,int si,int ei){
        if(s.length()==1){
            return true;
        }
        while(si<=ei){
            if(s.charAt(si)==s.charAt(ei)){
                si++;
                ei--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}