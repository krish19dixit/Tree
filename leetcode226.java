package leetcode;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class leetcode226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // invert the left tree and then invert the  right tree then swap the nodes with respect to root node.
        // ie post order travelsal
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        // now swap them
        root.left = right;
        root.right = left;

        return root;
    }
}
