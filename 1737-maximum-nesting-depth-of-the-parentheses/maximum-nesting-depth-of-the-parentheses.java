class Solution {
    public int maxDepth(String s) {
        Stack<Character> result=new Stack<>();
        int count=0;
        int maxDepth=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                count++;
                maxDepth=Math.max(maxDepth,count);
                result.push(ch);
            }
            else{
                if(!result.isEmpty()){
                    if(result.peek()=='(' && ch==')'){
                    count--;
                    result.pop();
                }
                }

            }

            
        }
        if(result.isEmpty()){
                return maxDepth;
            }

            return 0;
        
    }
}