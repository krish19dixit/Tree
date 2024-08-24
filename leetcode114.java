package leetcode;

// approach 1 space and time complexity both O(n);
// travers the tree and insert the  items in queue 
// after traversing pop out the first items from queue and make the  left child should be null and right child should be next item of queue first element.

// approact 2 can we make it in O(1) space;
// by using linkedlist
public class leetcode114 {
    public void flatten(TreeNode root) {
        TreeNode currenode = root;
        while (currenode != null) {
            if (currenode.left != null) {
                TreeNode temp = currenode.left;
                while (temp.right != null) {// to till  end of rigth child of left tree.
                    temp = temp.right;
                }
                temp.right = currenode.right;// when you find the null in right child of left subtree then connect right subtree of root node to that point.
                currenode.right = currenode.left;// now connect that whole left sub tree to right of subtree.
                currenode.left = null;// and in the end assign the  left of node to null;
            }
            currenode = currenode.right;
        }

    }
}
