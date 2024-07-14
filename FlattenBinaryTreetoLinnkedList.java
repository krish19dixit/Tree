// step1.mark the root node as current
// step2.make a temp variabble and  reach that to right of current.left node.
// step3. transfer all the current.right element to right of that temp variable. 
// step4. make that original current element to right;
// assign all the left of node to null 
// and move that current to right.
class FlattenBinaryTreetoLinnkedList{
  public void flatten(TreeNode root){
    TreeNode current=root;
    while(current!=null){
      if(current.left!=null){
        TreeNode temp=current.left;
        while(temp.right!=null){
          temp=temp.right;
        }
        temp.right=current.right;
        current.right=current.left;
        current.left=null;
      }
      current=current.right;
    }
    }
  }
}