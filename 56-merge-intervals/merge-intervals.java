class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(intervals[0][0]);
        temp.add(intervals[0][1]);
        list.add(temp);

        for(int i=1;i<intervals.length;i++){
            List<Integer> prev = list.get(list.size()-1);
            int prevEnd = prev.get(1);
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if(currStart <= prevEnd){
                prev.set((prev.size()-1), Math.max(currEnd, prevEnd)); 
            } 
            else { 
                List temp1 = new ArrayList<>(); 
                temp1.add(currStart); 
                temp1.add(currEnd);
                list.add(temp1); 
            } 
        }
         int[][] result = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
             result[i][0] = list.get(i).get(0);
             result[i][1] = list.get(i).get(1);
        }

        return result;
        
    }
}