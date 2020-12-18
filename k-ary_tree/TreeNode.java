import java.util.*;

public class TreeNode {
	// Definition for a Node.
	int val;
	List<TreeNode> children;
	int test;
	TreeNode() {}
	TreeNode(int val) {
		this.val = val;
		this.children = new ArrayList<TreeNode>();
	}
	TreeNode(int val, List<TreeNode> children) {
		this.val = val;
		this.children = children;
	}
}