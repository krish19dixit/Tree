package leetcode;

public class leetcode124 {
    int sum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        helper(root);
        return sum;
    }
    public int helper(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=helper(node.left);
        int right=helper(node.right);
        left=Math.max(0, left);
        right=Math.max(0, right);
        int pathsum=left+right+node.val;
        sum=Math.max(sum,pathsum);
        return Math.max(left, right)+node.val;
    }
    
}
