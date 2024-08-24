package leetcode;

public class leetcode236 {
    
    public TreeNode lowestCommanAncestor(TreeNode root,TreeNode p,TreeNode q){
    if(root==null){
        return null;
    }
    if(root==p || root==q){
        return root;
    }
    TreeNode leftnode=lowestCommanAncestor(root.left, p, q);
    TreeNode rightnode=lowestCommanAncestor(root.right, p, q);
    if(leftnode !=null && rightnode!=null){
        return root;
    }
    if(leftnode==null){
        return rightnode;
    }else{
        return leftnode;
    }
    }
}
