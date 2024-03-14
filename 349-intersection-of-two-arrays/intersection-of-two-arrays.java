class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !map.containsKey(nums1[i])){
                    map.put(nums1[i],0);
                }
            }
        }
        
        int n=map.size();
        int result[]=new int[n];
        int idx=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           result[idx++]=entry.getKey();
         }
       return result;
    }
}