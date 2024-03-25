class Solution {
    public boolean isValid(String s) {
        Stack<Character> result=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                result.push(ch);
            }

            else{
                if(result.isEmpty()){
                    return false;
                }
                if(ch==')' && result.peek()=='('
                   ||ch=='}' && result.peek()=='{'
                   ||ch==']' && result.peek()=='['){
                      result.pop();
                 }
                else{
                    return false;
                }
            }
        }

        if(result.isEmpty()){
            return true;
        }
        return false;
        
    }
}