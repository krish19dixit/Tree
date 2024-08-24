package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class leetcode637 {
    
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>() ;
        if(root==null){
            return result;
        }
        // create a queue
        Queue <TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int currentsize=queue.size();
            double average=0;
            for(int i=0;i<currentsize;i++){
                TreeNode currentNode=queue.poll();
                average+=currentNode.val;
                currentNode.add(currentNode.val);
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            average=average/currentsize;
            result.add(average);
        }
        return result;
    }
    /// search to next right  elements in tree
    public TreeNode findsuccessor(TreeNode root, int  key){
        if(root==null){
            return null;
        }
        // create a queue
        Queue <TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int currentsize=queue.size();
                TreeNode currentNode=queue.poll();
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            if(currentNode.val==key){
                break;
            }
        }
        return queue.peek();
    }
}

