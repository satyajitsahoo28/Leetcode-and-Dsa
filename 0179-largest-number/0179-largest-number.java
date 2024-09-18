class Solution {
    public String largestNumber(int[] nums) {
        String[] elements=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            elements[i]=Integer.toString(nums[i]);
        }

        Arrays.sort(elements, new Comparator<String>(){
            public int compare(String a,String b){
                String s1=a+b;
                String s2=b+a;

                return s2.compareTo(s1);
            }
        });

        if(elements[0].equals("0")){
            return "0";
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<elements.length;i++){
            sb.append(elements[i]);
        }
        
        return sb.toString();
    }
}