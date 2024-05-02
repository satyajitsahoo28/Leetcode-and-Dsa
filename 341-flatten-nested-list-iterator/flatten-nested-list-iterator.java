/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
 //aprroach 1 using stack
// public class NestedIterator implements Iterator<Integer> {
//     Stack<NestedInteger> st;

//     public NestedIterator(List<NestedInteger> nestedList) {
//         int n=nestedList.size();
//         st=new Stack<>();
//         for(int i=n-1;i>=0;i--){
//             st.push(nestedList.get(i));
//         }
        
//     }

//     @Override
//     public Integer next() {
//         int num=st.peek().getInteger();
//         st.pop();
//         return num;
        
//     }

//     @Override
//     public boolean hasNext() {
//         if(st.isEmpty()){
//             return false;
//         }

//         while(!st.isEmpty()){
//             NestedInteger obj=st.peek();

//             if(obj.isInteger()){
//                 return true;
//             }
//             st.pop();
//             List<NestedInteger> list=obj.getList();
//             for(int i=list.size()-1;i>=0;i--){
//                 st.push(list.get(i));
//             }
//         }
//         return false;
        
//     }
// }

//aproach 2 using queue
public class NestedIterator implements Iterator<Integer> {
    Queue<Integer> q;
    

    public NestedIterator(List<NestedInteger> nestedList) {
        q=new LinkedList<>();
        flatten(nestedList);        
    }
    void flatten(List<NestedInteger> nestedList){
        int n=nestedList.size();
        for(int i=0;i<n;i++){
            NestedInteger obj=nestedList.get(i);
            if(obj.isInteger()){
                q.offer(obj.getInteger());
            }
            else{
                flatten(obj.getList());
            }
        }
    }

    @Override
    public Integer next() {
       int num=q.peek();
       q.poll();
       return num;
        
    }

    @Override
    public boolean hasNext() {
        return !q.isEmpty();
        
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */