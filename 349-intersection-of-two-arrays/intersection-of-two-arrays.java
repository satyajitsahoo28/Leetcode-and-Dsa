class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     for(int i=0;i<nums1.length;i++){
    //         for(int j=0;j<nums2.length;j++){
    //             if(nums1[i]==nums2[j] && !map.containsKey(nums1[i])){
    //                 map.put(nums1[i],0);
    //             }
    //         }
    //     }
        
    //     int n=map.size();
    //     int result[]=new int[n];
    //     int idx=0;
    //     for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    //        result[idx++]=entry.getKey();
    //      }
    //    return result;

     // Create two hash sets to store the elements of the arrays.
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    // Add elements of arr1 to set1.
    for (int num : nums1) {
      set1.add(num);
    }

    // Add elements of arr2 to set2.
    for (int num : nums2) {
      set2.add(num);
    }

    // Find the intersection by finding the elements that are in both sets.
    Set<Integer> intersectionSet = new HashSet<>(set1);
    intersectionSet.retainAll(set2);

    // Convert the intersection set back to an int array.
    int[] ans = new int[intersectionSet.size()];
    int i = 0;
    for (int num : intersectionSet) {
      ans[i++] = num;
    }

    return ans;
    }
}