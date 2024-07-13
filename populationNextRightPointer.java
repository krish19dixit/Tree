class Node{
  public int val;
  public Node left;
  public Node right;
  public Node next;
  public Node(int val){
    this.val=val;
  }
  public Node (int val,Node left,Node right,Node next){
    this.val=val;
    this.left=left;
    this.right=right;
    this.next=next;
  }
}
class populationNextRightPointer{
  public static void main(String[] args){
    
  }
  public Node connect(Node root){
    if(root==null){
      return null;
    }
    Node leftNode=root;
    while(leftNode!=null){
      Node current=leftNode;
      while(current!=null){
        current.left.next=current.right;
        if(current.next!=null){
          current.right.next=current.next.left;
        }
        current=current.next;
      }
      leftNode=leftNode.next;
    }
  return root;
  }
}