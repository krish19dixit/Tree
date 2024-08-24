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

public class leetcode543 {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        // diameter of a binary tree is the length of the longest path beteen any two
        // nodes in a tree. this path may or maynot pass through the root.
        height(root);
        return diameter-1;
    }

    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        // get the answer from left tree then right tree and then root node so it is a post order travelsal.
        int leftheight = height(node.left);
        int rightheight = height(node.right);
        int dia = leftheight + rightheight + 1;
        return Math.max(leftheight, rightheight) + 1;
    }
}
