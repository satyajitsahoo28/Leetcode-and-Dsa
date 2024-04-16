class Solution {
    public int calPoints(String[] operations) {
        // List<Integer> list=new ArrayList<>();
        // int idx=0;
        // for(int i=0;i<operations.length;i++){
        //     String op = operations[i];

        // if (op.equals("C")) {
        //     idx--;
        //     list.remove(idx);
        // } 
        // else if (op.equals("D")) {
        //     list.add(list.get(idx - 1) * 2);
        //     idx++;
        // }
        // else if (op.equals("+")) {
        //     int sum = list.get(idx - 2) + list.get(idx - 1);
        //     list.add(sum);
        //     idx++;
        // } 
        // else {
        //     int num = Integer.parseInt(op);
        //     list.add(num);
        //     idx++;
        // }
        // }

        // int ans=0;
        // for(int i=0;i<list.size();i++){
        //     ans+=list.get(i);
        // }

        // return ans;
        
        Stack<Integer> s=new Stack<>();
        int ans=0;
        for(int i=0;i<operations.length;i++){
            String op=operations[i];

            if(op.equals("C")){
                int val=s.pop();
                ans-=val;
            }

            else if(op.equals("D")){
                s.push(s.peek()*2);
                ans+=s.peek();
            }

            else if(op.equals("+")){
                if(!s.isEmpty()){
                    int removeVal=s.pop();
                    int sum=removeVal+s.peek();
                    s.push(removeVal);
                    s.push(sum);
                    ans+=sum;
                }
            }

            else{
                int num=Integer.parseInt(op);
                s.push(num);
                ans+=s.peek();
            }

        }
        return ans;
    }
}