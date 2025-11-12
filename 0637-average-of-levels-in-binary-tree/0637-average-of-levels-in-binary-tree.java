/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
       List<Double> result = new ArrayList<>();
       if(root==null) return result;
       Queue<TreeNode> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
        int levelSize=q.size();
        double ans=0.0;
        for(int i=0;i<levelSize;i++){
            TreeNode curr=q.remove();
            ans+=curr.val;

            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        
        result.add(ans/levelSize);
       }
       return result;
    }
}