
class Solution {
    static int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        count =0;
        findpath(root,targetSum);
        return count;
    }

    public void findpath(TreeNode root, long targetSum){
        if(root == null)  return ; 

        paths(root,targetSum);
        findpath(root.left,targetSum);
        findpath(root.right,targetSum);
    }

    public void paths(TreeNode root, long targetSum){
        if(root == null) return ;
        if(root.val == targetSum){
            count++;
        }
        paths(root.left,targetSum-root.val);
        paths(root.right,targetSum-root.val);
    }
}