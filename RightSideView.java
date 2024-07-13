class RightSideView{
  public static void main(String[] args){
    
  }
  public List<Integer> rightSideView(TreeNode root){
    List<Integer> result=new ArrayList<>();
    if(root==null){
      return result;
    }
    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
     int queuesize=queue.size();
      for(int i=0;i<queuesize;i++){
        TreeNode currentNode=queue.poll();// pop out one by  one element untill we get last element of current queue size.
        if(i==queuesize-1){
          result.add(currentNode.val);
        }
        if(currentNode.left!=null){
          queue.offer(currentNode.left);
        }
        if(currentNode.right!=null){
          queue.offer(currentNode.right);
        }
      }
    }
    return result;
  }
}