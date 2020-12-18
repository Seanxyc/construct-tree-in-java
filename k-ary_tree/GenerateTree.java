import java.util.*;
public class GenerateTree {
	public static TreeNode arrayToTreeNode(Integer[] array){
		if(array.length == 0) {
			return null;
		}
		TreeNode root = new TreeNode(array[0]);
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		for (int i = 2; i < array.length; i++){
			TreeNode node = queue.peek();
			while (i < array.length && array[i] != null){
				node.children.add(new TreeNode(array[i]));
				queue.offer(node.children.get(node.children.size() - 1));
				i++;
			}
			queue.poll();
		}
		return root;
	}
}