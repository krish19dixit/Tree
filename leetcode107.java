package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class leetcode107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>() ;
        if(root==null){
            return result;
        }
        // create a queue
        Queue <TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int currentsize=queue.size();
            List<Integer> currentList=new ArrayList<>(currentsize);
            for(int i=0;i<currentsize;i++){
                TreeNode currentNode=queue.poll();
                currentList.add(currentNode.val);
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(0,currentList);
        }
        return result;
    }
     
}
