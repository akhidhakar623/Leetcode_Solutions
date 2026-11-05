
class Solution {
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)  return 0; 
        paths(root,targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return count;
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