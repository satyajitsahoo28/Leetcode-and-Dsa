class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int a:nums){
        //     map.put(a,map.getOrDefault(a,0)+1);
        // }
        // List<Integer> list=new ArrayList<>();
        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     if(entry.getValue()>1){
        //         list.add(entry.getKey());
        //     }
        // }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;

            if(nums[index]<0){
                list.add(index+1);
            }

            nums[index]=nums[index]*-1;
        }

        return list;
    }
}