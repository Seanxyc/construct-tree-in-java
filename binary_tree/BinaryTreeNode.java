import java.util.*;

public class BinaryTreeNode{
	int val;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode() {}
	BinaryTreeNode(int val) { this.val = val; }
	BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}