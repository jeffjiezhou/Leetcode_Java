/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new LinkedList<Integer>();
            for(int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.val);
                if(head.left != null)
                    queue.add(head.left);
                if(head.right != null)
                    queue.add(head.right);
            }
            list.add(level);
        }

        return list;
    }
}