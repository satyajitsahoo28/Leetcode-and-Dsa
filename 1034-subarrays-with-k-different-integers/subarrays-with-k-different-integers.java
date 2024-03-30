class Solution {
    public int solveSubarray(int nums[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int unique=0;
        int ans=0;

        while(right<nums.length){
            // if(!map.containsKey(nums[right])){
            //     unique++;
            //     map.put(nums[right],1);
            // }
            // else{
            //     map.put(nums[right],map.get(nums[right])+1);
            // }

            // while(unique>k){
            //     map.put(nums[left],map.get(nums[left])-1);
            //     if(map.get(nums[left])==0){
            //         unique--;
            //     }
            //     left++;
            // }

            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            ans+=(right-left+1);
            right++;
        }

        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
       return solveSubarray(nums,k)-solveSubarray(nums,k-1);
        
    }
}