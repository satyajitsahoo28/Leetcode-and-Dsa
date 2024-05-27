class Solution {
     boolean decimalToBase(int n,int b) 
    { 
        int remainder, quotient = n; 
        String binaryNum = ""; 
        while (quotient > 0) { 
            remainder = quotient % b; 
            binaryNum = Integer.toString(remainder) + binaryNum; 
            quotient = quotient / b; 
        } 
        int si=0;
        int ei=binaryNum.length()-1;
        while(si<ei){
            if(binaryNum.charAt(si)!=binaryNum.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true; 
    } 
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            if(!decimalToBase(n,i)){
                return false;
            }
        }
        return true;
        
    }
}