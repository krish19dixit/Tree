import org.junit.experimental.theories.internal.BooleanSupplier;

class zigzagLevelTraversal{
  public static void main(String[] args){
    
  }
  public List<List<Integer>> zigzagLevelOrder(TreeNode root){
    List<List<Integer>> result=new ArrayList<>();
    if(root==null){
      return result;
    }
    Boolean reverse=false;
    Deque<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
      int size=queue.size();
      List<Integer> tempResult=new ArrayList<>(size);
      for(int i=0;i<size;i++){
        if(!reverse){
          TreeNode currentNode=queue.pollFirst();
          tempResult.add(currentNode.val);
          if(currentNode.left!=null){
            queue.addLast(currentNode.left);
          }
          if(currentNode.right!=null){
            queue.addLast(currentNode.right);
          } 
        }
        else{
          TreeNode currentNode=queue.pollBack();
          tempResult.add(currentNode.val);
          
          if(currentNode.right!=null){
            queue.addFirst(currentNode.right);
          }
          if(currentNode.left!=null){
            queue.addFirst(currentNode.left);
          }
        }
        
      }
      reverse=!reverse;
      result.add(tempResult);
    }
    return result;
  }
}