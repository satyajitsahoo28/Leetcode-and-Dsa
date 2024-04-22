class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[temperatures.length];

        for(int i=temperatures.length-1;i>=0;i--){
            int curr=temperatures[i];

            // if(s.isEmpty()){
            //     ans[i]=0;
            // }
            // else if(curr>temperatures[s.peek()]){
            //    while(!s.isEmpty()&&curr>temperatures[s.peek()]){
            //     s.pop();
            //    }
            //    if(s.isEmpty()){
            //     ans[i]=0;
            //    }
            //    else{
            //     ans[i]=s.peek()-i;
            //    }
            // }
            // else{
            //     ans[i]=s.peek()-i;
            // }

            // s.push(i);
            while (!s.isEmpty() && curr >= temperatures[s.peek()]) {
                 s.pop();
            }

            ans[i] = s.isEmpty() ? 0 : s.peek() - i;
            s.push(i);
        }

        return ans;
    }
}