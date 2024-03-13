class Solution {
    public boolean containsDuplicate(int[] nums) {
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

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=2){
                return true;
            }
        }
        return false;
    }
}