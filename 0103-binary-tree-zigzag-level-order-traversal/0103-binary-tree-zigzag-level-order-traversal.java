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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        boolean flag = false;
        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                if (!flag) {
                    TreeNode curr = q.removeFirst();
                    temp.add(curr.val);
                    
                    if (curr.left != null) {
                        q.addLast(curr.left);
                    }
                    if (curr.right != null) {
                        q.addLast(curr.right);
                    }
                    
                } else {
                    TreeNode curr = q.removeLast();
                    temp.add(curr.val);
 
                    if (curr.right != null) {
                        q.addFirst(curr.right);
                    }
                    if (curr.left != null) {
                        q.addFirst(curr.left);
                    }
                }
            }
            flag = !flag;
            result.add(temp);
        }
        return result;
    }
}