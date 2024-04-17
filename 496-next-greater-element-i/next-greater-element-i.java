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

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    result[i]=ans[j];
                }
            }
        }
        return result;
        
    }
}