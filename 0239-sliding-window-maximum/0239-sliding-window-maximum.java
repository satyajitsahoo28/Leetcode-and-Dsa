class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=0;
        Deque<Integer> dq = new ArrayDeque<>();
        int result[]=new int[n-k+1];

        while(j<n){
            while(!dq.isEmpty() && dq.peekLast() < nums[j]){
                dq.removeLast();
            }
            dq.add(nums[j]);

            if(j-i+1>k){
                if(!dq.isEmpty() && nums[i]==dq.peekFirst()){
                    dq.removeFirst();
                }
                i++;
            }

            if(j-i+1==k){
                result[i]=dq.peekFirst();
            }
            j++;
        }
        return result;
    }
}