import java.util.*;

public class GenerateBinaryTree {
  public static BinaryTreeNode arrayToTreeNode(Integer[] array){
    if(array.length == 0){
      return null;
    }
    BinaryTreeNode root = new BinaryTreeNode(array[0]);
    Queue<BinaryTreeNode> queue = new LinkedList<>();
    queue.add(root);
    boolean isLeft = true;
    for(int i = 1; i < array.length; i++){
      // node=queue第一个元素
      BinaryTreeNode node = queue.peek();
      if(isLeft){
        if(array[i] != null){
          node.left = new BinaryTreeNode(array[i]);
          // 添加
          queue.offer(node.left);
        }
        isLeft = false;
      }else {
        if(array[i] != null){
          node.right = new BinaryTreeNode(array[i]);
          queue.offer(node.right);
        }
        queue.poll();
        isLeft = true;
      }
    }
    return root;
  }
}