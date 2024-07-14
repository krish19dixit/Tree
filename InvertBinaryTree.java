class InvertBinaryTree{
  // SWAP THE  NODES
  public TreeNode InvertBinaryTree(TreeNode root){
    if(root==null){
      return null;
    }
    TreeNode leftMost=InvertBinaryTree(root.left);
    TreeNode rightMost=InvertBinaryTree(root.right);
    root.left=rightMost;
    root.right=leftMost;
    return root;
  }
   
}