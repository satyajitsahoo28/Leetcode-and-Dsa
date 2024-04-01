class Solution {
    public int lengthOfLastWord(String s) {
        // int i=0;
        // for(i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch!=' '){
        //         break;
        //     }
        // }
        // int j=0;
        // for(j=s.length()-1;j>=0;j--){
        //     char ch=s.charAt(j);
        //     if(ch!=' '){
        //         break;
        //     }
        // }
        // int len=0;
        // for(int k=i;k<j;k++){
        //     char ch=s.charAt(k);
        //     if(ch==' '){
        //         len=0;
        //     }
        //     len++;
        // }

        // return len;

        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){
                len++;
            }
            //space found
            else if(len>0){
                break;
            }
        }
        return len;
        
    }
}