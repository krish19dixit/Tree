package leetcode;

public class leetcode104 {
    // maximum depth of tree.
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int leftdepth=maxDepth(root.left);
        int rightdepth=maxDepth(root.right);
        int depth=Math.max(leftdepth, rightdepth)+1;
        return depth;
    }
}
