class Solution {
     String decimalToBase(int n,int b) 
    { 
        int remainder, quotient = n; 
        String binaryNum = ""; 
        while (quotient > 0) { 
            remainder = quotient % b; 
            binaryNum = Integer.toString(remainder) + binaryNum; 
            quotient = quotient / b; 
        } 
        return binaryNum; 
    } 
    boolean checkPalindrome(int n,int i){
        String s=decimalToBase(n,i);
        int si=0;
        int ei=s.length()-1;
        while(si<=ei){
            if(s.charAt(si)!=s.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            if(!checkPalindrome(n,i)){
                return false;
            }
        }
        return true;
        
    }
}