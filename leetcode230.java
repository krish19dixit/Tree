package leetcode;

public class leetcode230 {
    int count = 0;
    public int kthSmallest(TreeNode root,int  k){
        return helper(root, k).val; 
    }

    public TreeNode helper(TreeNode root, int k) {
        // convert it into sorted array
        // inorder traversal
        if (root == null) {
            return null;
        }
        TreeNode left = helper(root.left, k);
        if (left != null) {
            return left;
        }
        count++;
        if(count==k){
            return root;
        }
        return helper(root.right, k);
    }
}
