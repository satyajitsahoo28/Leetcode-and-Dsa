class Pair implements Comparable<Pair>{
    int num;
    int idx;

    Pair(int num,int idx){
        this.num=num;
        this.idx=idx;
    }

    @Override
    public int compareTo(Pair p){
        if(this.num==p.num){
            return this.idx-p.idx;
        } 
        return this.num-p.num;
        
    }
}
class Solution {
    public long findScore(int[] nums) {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        boolean mark[]=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            pq.add(new Pair(nums[i],i));
        }

        long score=0;
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            int num=curr.num;
            int idx=curr.idx;

            if(mark[idx]){
                continue;
            }else{
                for(int i=-1;i<=1;i++){
                    int newIdx=idx-i;
                    if(newIdx>=0 && newIdx<nums.length){
                        mark[newIdx]=true;
                    }
                }
                score+=num;
            }

        }
        return score;
    }
}