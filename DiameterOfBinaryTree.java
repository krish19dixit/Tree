class DiameterOfBinaryTree{
  public static  void main(String[] args){
    
  }
  int diameter=0;
  public int DiameterOfBinaryTree(TreeNode root){
    if(root==null){
      return 0;
    }
    height(root);
    return diameter-1;
  }
  public int height(TreeNode node){
    if(node==null){
      return 0;
    }
    
    int leftHeigth=height(node.left);
    int rightHeight=height(node.right);
    int dia=leftHeigth + rightHeight + 1;
    diameter=Math.max(diameter,dia);
    return Math.max(leftHeigth,rightHeight)+1;
}