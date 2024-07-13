

public class BFS {
  public static void main(String[] args) {    
  }
  public List<List<Integer>> levelOrder(TreeNode root){
    List<List<Integer>> result=new ArrayList<>();
    if(root==null){
      return result;
    }

    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
      int levelsize=queue.size();
      List<Integer> levelElement=new ArrayList<>(levelsize);
      for(int i=0;i<levelsize;i++){
        TreeNode currentNode=queue.poll();
        levelElement.add(currentNode.val);
        if(currentNode.left!=null){
          queue.offer(currentNode.left);
        }
        if(currentNode.right!=null){
          queue.offer(currentNode.right);
        }
      }
      result.add(levelElement.val);
    }
    return result;
    
  }


}