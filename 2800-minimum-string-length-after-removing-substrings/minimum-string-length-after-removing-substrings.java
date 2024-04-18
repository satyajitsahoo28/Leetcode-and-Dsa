class Solution {
    public int minLength(String s) {
        Stack<Character> ans=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!ans.isEmpty()){
                if(ans.peek()=='A' && ch=='B'
                || ans.peek()=='C' && ch=='D'){
                      ans.pop();
                }
                else{
                    ans.push(ch);
                }
            }
            else{
                ans.push(ch);
            }
        }
        return ans.size();
        
    }
}