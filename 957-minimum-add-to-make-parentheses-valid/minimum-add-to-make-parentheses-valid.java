class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int close_bracket=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                st.push(ch);
            }
            if(!st.isEmpty()){
                if(st.peek()=='('&& ch==')'){
                    st.pop();
                }
            }
           else{
            close_bracket++;
           }
        }
        close_bracket+=st.size();
        return close_bracket;
        
    }
}