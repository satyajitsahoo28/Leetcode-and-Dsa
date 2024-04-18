class Solution {
    // public int countStudents(int[] students, int[] sandwiches) {
    //     Queue<Integer> q=new LinkedList<>();
    //     Stack<Integer> s=new Stack<>();

    //     for(int i=0;i<students.length;i++){
    //         q.add(students[i]);
    //     }

    //     for(int i=sandwiches.length-1;i>=0;i--){
    //         s.push(sandwiches[i]);
    //     }
    //     int count=0;
    //     while(!s.isEmpty()){
    //         count=0;
    //         if(s.peek()==q.peek()){
    //             s.pop();
    //             q.remove();
    //         }
    //         else{
    //             while(s.peek()!=q.peek() && count<s.size()){
    //                 int val=q.remove();
    //                 q.add(val);
    //                 count++;
    //             }
    //             if(s.peek()==q.peek()){
    //                 s.pop();
    //                 q.remove();
    //             }
    //             else{
    //               return s.size();  
    //             }

    //         }
    //     }
    //     return s.size();
    // }
    public int countStudents(int[] students, int[] sandwiches) {
        int n=sandwiches.length;
        int s_zero=0;
        int s_one=0;
        for(int i=0;i<students.length;i++){
            if(students[i]==0){
                s_zero++;
            }
            else{
                s_one++;
            }
        }

        for(int i=0;i<sandwiches.length;i++){
        if(sandwiches[i]==0){
            if(sandwiches[i]==0 && s_zero>0){
                s_zero--;
            }
            else{
                return n-i;
            }
        }
        if(sandwiches[i]==1){
            if(sandwiches[i]==1 && s_one>0){
                s_one--;
            }
            else{
                return n-i;
            }
        }
        }
        return 0;
    }
}