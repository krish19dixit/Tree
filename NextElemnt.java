import org.hamcrest.StringDescription;

class NextElement{
  public static void main(String[] args){
    
  }
  public TreeNode nextNode(TreeNode root, int target){
    if(root==null){
      return null;
    }
    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
      int currentsize=queue.size();
      TreeNode CurrentNode=queue.poll();
      if(CurrentNode.left!=null){
        queue.offer(CurrentNode.left);
      }
      if(CurrentNode.right!=null){
        queue.offer(CurrentNode.right);
      }
      if(CurrentNode.val==target){
        break; 
        }
    }
    return queue.peek();
  }
}