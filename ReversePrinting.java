class ReversePrinting{
  public static void main(String[] args){
    
  }
  public List<List<Integer>> ReversePrinting(TreeNode root){
    List<List<Integer>> result=new ArrayList<>();
    if(root==null){
      return result;
    }
    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
  while(!queue.isEmpty()){
    int size=queue.size();
    List<Integer> tempResult=new ArrayList<>(size);
    for(int i=0;i<size;i++){
      TreeNode currentNode=queue.poll();
      tempResult.add(currentNode.val);
      if(currentNode.left!=null){
        queue.offer(currentNode.left);
      }
      if(currentNode.right!=null){
        queue.offer(currentNode.right);
      }
    }
    result.add(0,tempResult);
  }
    return result;
  }
}