class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }

        for(int i=sandwiches.length-1;i>=0;i--){
            s.push(sandwiches[i]);
        }
        int count=0;
        while(!s.isEmpty()){
            count=0;
            if(s.peek()==q.peek()){
                s.pop();
                q.remove();
            }
            else{
                while(s.peek()!=q.peek() && count<s.size()){
                    int val=q.remove();
                    q.add(val);
                    count++;
                }
                if(s.peek()==q.peek()){
                    s.pop();
                    q.remove();
                }
                else{
                  return s.size();  
                }

            }
        }
        return s.size();
    }
}