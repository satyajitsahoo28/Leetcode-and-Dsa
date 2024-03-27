class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int left=i;
        //     int sum=0;

        //     while(left>=0){
        //         sum+=nums[left];
        //         if(sum==k){
        //             count++;
        //         }
        //         left--;
        //     }

        // }
        // return count;

        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int preSum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
             preSum+=nums[i];
            int diff=preSum-k;
            if(map.containsKey(diff)){
                count+=map.get(diff);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}