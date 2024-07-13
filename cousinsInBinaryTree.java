class cousinsInBinaryTree{
  public static void main(String[] args){
    
  }
  public boolean isCousins(TreeNode root,int x,int y){
    TreeNode xx=findNode(root,x);
    TreeNode yy=findNode(root,y);
    return((level(root,xx,0)==level(root,yy,0)) && (!isSibling(root,xx,yy)));
  }
  TreeNode findNode(TreeNode node, int x){
    if(node==null){
      return null;
    }
    if(node.val==x){
      return node;
    }
    TreeNode leftNode= findNode(node.left,x);
    if(leftNode!=null){
      return leftNode;
    }
    return findNode(node.right,x);
  }
  boolean isSibling(TreeNode node,int x, int y){
    if(node==null){
      return false;
    }
    return(
      (node.left==x && node.right==y) || (node.right==x && node.left==y)|| isSibling(Node.left,x,y) || isSibling(Node.right,x,y)
    );
  }
  int level(TreeNode node,int x,int lev){
    if(node==null){
      return 0;
    }
    if(Node==x){
      return lev;
    }
  int l=level(node.left,x,lev+1);
    if(l!=0){
      return l;
    }
    return level(node.right,x,lev+1);
  }
  
}