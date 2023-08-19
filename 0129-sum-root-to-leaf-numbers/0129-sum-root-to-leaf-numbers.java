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
    int res=0;
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root,0);
        return res;
        
    }
    public void dfs(TreeNode node,int val1){
        if(node==null){
            return;
        }
        val1*=10;
        val1+=node.val;
        if(node.left==null && node.right==null){
            res+=val1;
            return;
        }
        dfs(node.left,val1);
        dfs(node.right,val1);
    }
}