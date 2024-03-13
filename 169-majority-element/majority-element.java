class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int currEle=nums[i];

            if(map.containsKey(currEle)){
                map.put(currEle,map.get(currEle)+1);
            }
            else{
                map.put(currEle,1);
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>nums.length/2){
                 ans=entry.getKey();
            }
        }

        return ans;
    }
}