public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
class CovertSortedArraytoBinarySearchTree{
  public TreeNode sortedArrayToBST(int[] nums){
    if(nums.length==0){
      return null;
    }
    int n=nums.length;
    if(n==1){
      TreeNode node =new TreeNode(nums[0]);
    }
    TreeNode head=buildTree(nums,0,n-1);
    return head;
  }
  public TreeNode buildTree(int[] arr,int start,int end){
    if(start>end){
      return null;
    }
    int mid=start+(end-start)/2;
    TreeNode node=new TreeNode(arr[mid]);
  node.left=buildTree(arr,start,mid-1);
    node.right=buildTree(arr,mid+1,end);
    return node;
  }
 
}