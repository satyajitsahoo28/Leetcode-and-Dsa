class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int index=0;
        int sum=0;

        while(index<s.length()-1){
            char ch=s.charAt(index);

            if(map.get(ch)<map.get(s.charAt(index+1))){
                sum-=map.get(ch);
            }
            else{
                sum+=map.get(ch);
            }
            index++;
        }

        sum+=map.get(s.charAt(s.length()-1));
        return sum;

    }
}