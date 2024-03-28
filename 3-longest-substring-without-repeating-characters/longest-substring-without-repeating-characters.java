class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap<Character,Integer> map=new HashMap<>();
        // int left=0;
        // int right=0;
        // int length=0;

        // while(right<s.length()){
        //     if(map.containsKey(s.charAt(right))){
        //         left=Math.max(map.get(s.charAt(right))+1,left);
        //     }
        //     map.put(s.charAt(right),right);
        //     length=Math.max(length,right-left+1);
        //     right++;
        // }
        // return length;

        int left=0;
        int right=0;
        int ans=0;
        int maxLen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<s.length()){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.get(ch)>1){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            ans=right-left+1;
            maxLen=Math.max(ans,maxLen);
            right++;
        }
        return maxLen;
   
    }
}