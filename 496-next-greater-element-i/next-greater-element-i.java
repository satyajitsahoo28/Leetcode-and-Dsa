class Solution {
    public int[] nextGreater(int arr[]){
        int ans[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
                while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i]=-1;
                }
                else{
                    ans[i]=arr[s.peek()];
                }
            s.push(i);
        }
        return ans;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=nextGreater(nums2);
        int result[]=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],ans[i]);
        }

        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                result[i]=map.get(nums1[i]);
            }
        }
        
        return result;
        
    }
}