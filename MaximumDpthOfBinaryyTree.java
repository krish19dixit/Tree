class MaximumDpthOfBinaryyTree{
  public int maxDepth(TreeNode root){
    if(root==null){
      return 0;
    }
    int leftdepth=maxDepth(root.left);
    int rightdepth=maxDepth(root.right);
    int ans= Math.max(leftdepth,rightdepth)+1;
    return ans;
  }
}