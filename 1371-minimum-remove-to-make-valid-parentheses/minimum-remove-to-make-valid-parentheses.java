class Solution {
    public String minRemoveToMakeValid(String s) {
        // int b_open=0;
        // int b_close=0;
        // int open=0;
        // int close=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='('){
        //         b_open++;
        //     }
        //     else if(s.charAt(i)==')'){
        //         b_close++;
        //     }
        // }
        // int b_min=Math.min(b_open,b_close);
        // Stack<Character> ans=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);

        //     if(open>close && ch==')'){
        //         close++;
        //         ans.push(ch);
        //     }

        //     else if(ch=='(' && open<b_min){
        //         open++;
        //         ans.push(ch);
        //     }

        //     else if(ch!='(' && ch!=')'){
        //         ans.push(ch);
        //     }
        // }

        // StringBuilder result=new StringBuilder();
        // for(int i=0;i<ans.size();i++){
        //     char ch=ans.pop();
        //     result.insert(0,ch);
        // }

        // // if(open!=0 && close==0){
        // //     return "";
        // // }

        // return result.toString();

        Stack<Integer> st=new Stack<>();
        Set<Integer> set=new HashSet<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                st.push(i);
            }

            else if(ch==')'){
                if(st.isEmpty()){
                    set.add(i);
                }
                else{
                    st.pop();
                }
            }
        }

        while(!st.isEmpty()){
            set.add(st.peek());
            st.pop();
        }

        for(int i=0;i<s.length();i++){
            if(!set.contains(i)){
               ans+=s.charAt(i);
            }
        }

        return ans;
        
        
    }
}