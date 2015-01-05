package aad.datastructures;
import java.lang.Integer;

public class BinaryTreeImplementation implements BinaryTree {

	private BinaryTreeNode root;
	private int height;
	private int subTreeHeight;
	
	public BinaryTreeImplementation() {
		height = 0;
	}

	private BinaryTreeNode add(BinaryTreeNode node, Integer value) {

		subTreeHeight++;

		//maybe tree is empty
		if (root == null) {
			root = new BinaryTreeNodeImplementation(value);
			return root;
		}

		//maybe i found the insertion point
		if (node == null) {
			return new BinaryTreeNodeImplementation(value);
		}

		//down to left subtree
		if (value < node.getValue()) {
			BinaryTreeNode leftSubtree = add(node.getLeft(), value);
			if (node.getLeft() == null) {
				node.setLeft(leftSubtree);
			}
			return leftSubtree;
		}

		//down to right subtree
		if (value > node.getValue()) {
			BinaryTreeNode rightSubtree = add(node.getRight(), value);
			if (node.getRight() == null) {
				node.setRight(rightSubtree);
			}
			return rightSubtree;
		}

		//maybe the node with same value already exists
		return node;
	}
	
	@Override
	public void add(int value) {
		subTreeHeight = 0;
		BinaryTreeNode node = add(root, value);
		height = height < subTreeHeight ? subTreeHeight : height;
	}

	@Override
	public boolean contains(int value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List inOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List preOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List postOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int height() {
		return height;
	}

}
