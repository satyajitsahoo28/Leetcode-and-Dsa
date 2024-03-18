class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Integer> bucket[]=new List[nums.length+1];

        for(int key:map.keySet()){
            int curr=map.get(key);

            if(bucket[curr]==null){
                bucket[curr]=new ArrayList<>();
            }

            bucket[curr].add(key);
        }

        int ans[]=new int[k];
        int idx=0;
        for(int pos=bucket.length-1;pos>=0 && idx<k;pos--){
            if(bucket[pos]!=null){
                for(Integer integer:bucket[pos]){
                    ans[idx++]=integer;
                }
            }
        }

        return ans;
    }
}