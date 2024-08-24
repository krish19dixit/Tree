package leetcode;

public class leetcode108 {
    public TreeNode sortedArrayToBST(int[] nums){
        if(nums.length==0){
            return null;
        }
        int start=nums[0];
        int end=nums.length;
        int mid=start+(end-start)/2;
        populatesorted(nums, 0, mid);
        populatesorted(nums, mid+1, end);

    }
    public void populatesorted(int []nums,int start,int end){
        if(start >= end){
            return ;
        }
        int mid=start+(end-start)/2;
        this.insert(mid);
        populatesorted(nums, start, mid);
        populatesorted(nums, mid+1, end);

    }
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
}
