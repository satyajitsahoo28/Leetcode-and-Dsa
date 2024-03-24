class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=Math.max(max,nums[i]);
        //     max=nums[i];
        // }

        // int ans[]=new int[nums.length-k+1];
        // int idx=0;
        // for(int i=k-1;i<nums.length && idx<ans.length;i++){
        //     ans[idx++]=nums[i];
        // }

        // return ans;

        // int max=Integer.MIN_VALUE;
        // int ans[]=new int[nums.length-k+1];
        // int curr=0;
        // int prev=0;
        // int idx=0;

        // for(int i=k-1;i<nums.length && idx<ans.length;i++){
        //     curr=i;

        //     while(curr>=prev){
        //         max=Math.max(max,Math.max(nums[curr],nums[prev]));
        //         curr--;
        //     }
        //     ans[idx++]=max;
        //     prev++;
        //     max=Integer.MIN_VALUE;
        // }
        // return ans;

        int n=nums.length;
        int ans[]=new int[n-k+1];
        int idx=0;

        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peek()<=i-k){
                dq.poll();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }

            dq.offer(i);
            if(i>=k-1){
                ans[idx++]=nums[dq.peek()];
            }
        }
        return ans;
    }
}