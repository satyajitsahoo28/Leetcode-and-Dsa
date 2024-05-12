class Solution {
    long conStrToInt(String num){
        return Long.parseLong(num);
    }
    public boolean digitCount(String num) {
        int n=num.length();
        int ans[]=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        int idx=n-1;
        long digit=conStrToInt(num);
        while(digit>0){
            ans[idx]=(int)(digit%10);
            digit/=10;
            idx--;
        }

        for(int i=0;i<n;i++){
            map.put(ans[i],map.getOrDefault(ans[i],0)+1);
        }

        for(int i=0;i<n;i++){
            if(!map.containsKey(i)){
                map.put(i,0);
            }
        }

        for(int i=0;i<n;i++){
            if (map.getOrDefault(i, 0) != ans[i]) {
                return false;
            }
        }
        return true;
        
    }
}