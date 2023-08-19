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
    ArrayList<Integer> res=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root.left==null && root.right==null)return root.val;
        dfs(root);
        Collections.sort(res);
        return res.get(k-1);
    }
    public void dfs(TreeNode node){
        if(node==null){
            return;
        }
        res.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}