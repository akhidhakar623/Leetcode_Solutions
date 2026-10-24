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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        dfs(root,ans,curr,targetSum);
        return ans;
    }
    public void dfs(TreeNode root,List<List<Integer>> ans,List<Integer> curr, int targetSum){
        if(root == null) return;
        curr.add(root.val);
        if(root.left == null && root.right ==null){
            if(targetSum == root.val){
                ans.add(new ArrayList<>(curr));
            }
        }

        dfs(root.left,ans,curr,targetSum-root.val);
        dfs(root.right,ans,curr,targetSum-root.val);
        curr.remove(curr.size()-1);
    }

}