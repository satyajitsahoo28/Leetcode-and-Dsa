class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            char c1=s.charAt(i);
            char c2=s.charAt(i+1);
            int asciiVal1=c1;
            int asciiVal2=c2;
            int absDiff=Math.abs(asciiVal1-asciiVal2);
            sum+=absDiff;
        }
        return sum;
        
    }
}