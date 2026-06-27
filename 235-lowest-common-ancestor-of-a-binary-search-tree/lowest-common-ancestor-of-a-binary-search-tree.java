/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode temp=root;
        if(root==null){
            return null;
        }
        if(root==p ||root==q){
            return root;
        }
        
        TreeNode left_s=lowestCommonAncestor(root.left,p,q);
        TreeNode right_s=lowestCommonAncestor(root.right,p,q);
        if(left_s!=null && right_s!=null){
            return root;
        }
        if(left_s==null){
            return right_s;
        }
        if(right_s==null){
            return left_s;
        }
        return null;
    }
}