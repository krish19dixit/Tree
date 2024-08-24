package leetcode;

public class leetcode124repeate {
    int ans=Integer.MIN_VALUE;
    public int maxPathSumm(TreeNode root){
        helper(root);
        return ans;
    }
    public int helper(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=helper(node.left);
        int right=helper(node.right);
        left=Math.max(0,left);
        right=Math.max(0, right);
        int pathsum=left+right+node.val;
        ans=Math.max(ans,pathsum);
        return Math.max(left, right)+node.val;
    }
}
