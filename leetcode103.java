package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class leetcode103 {
public List<List<Integer>> zigzagLevelOrder(TreeNode root){
// in normal order== remove from front and insert at back
// in reverse order== remove from back  and insert at front;
// by using dequeue method.
List<List<Integer>> result=new ArrayList<>();
    if(root==null){
        return result;
    }
        Deque <TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean reverse=false;
        while(!queue.isEmpty()){
            int currentsize=queue.size();
            List<Integer> currentLevel=new ArrayList<>(currentsize);
            for(int i=0;i<currentsize;i++){
            if(!reverse){
                // for not reverse insertation and deletation occures normally
                // insert last and delete from first
                    TreeNode currentNode=queue.pollFirst();
                    currentLevel.add(currentNode.val);
                    if(currentNode.left != null){
                        queue.addLast(currentNode.left);
                    }
                    if(currentNode.right != null){
                        queue.addLast(currentNode.right);
                    }
            }else{
                // delete from end element
                // for reverse order  insertation occures in reverse order means insert right first then left second in queue

                TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);
                    if(currentNode.right!=null){
                        queue.addFirst(currentNode.right);
                    }
                    if(currentNode.left != null){
                        queue.addFirst(currentNode.left);
                    }
            }
        }
    }
         reverse=!reverse;       
        result.add(currentLevel);
}
        return result;
}
}
