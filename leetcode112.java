class leetcode112 {

    public boolean hadPathSum(TreeNode root, int targetSum){
        if(root==null){
            return false;
        }
        if(root.val==targetSum && root.left==null && root.right==null){
            return true;
        }
        return hadPathSum(root.left, targetSum-root.val)|| hadPathSum(root.right, targetSum-root.val);
    }
}
