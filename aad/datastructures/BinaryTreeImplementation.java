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
		if (height < subTreeHeight) {
			height = subTreeHeight;
		}
	}

	@Override
	public boolean contains(int value) {

		return contains(root, value);
	}

	private boolean contains(BinaryTreeNode root, int value) {
		if (root == null) {
			return false;
		}
		if (value < root.getValue()) {
			return contains(root.getLeft(), value);
		}
		if (value > root.getValue()) {
			return contains(root.getRight(), value);
		}
		return true;
	}

	@Override
	public List inOrder() {
		List<Integer> list = new LinkedListImplementation<Integer>();
		inOrder(root, list);
		return list;
	}

	private void inOrder(BinaryTreeNode root, List list) {
		if (root != null) {
			inOrder(root.getLeft(), list);
			list.addItemAtTheEnd(root.getValue());
			inOrder(root.getRight(), list);
		}
	}



	@Override
	public List preOrder() {
		List<Integer> list = new LinkedListImplementation<Integer>();
		preOrder(root, list);
		return list;
	}

	private void preOrder(BinaryTreeNode root, List<Integer> list) {
		if (root != null) {
			list.addItemAtTheEnd(root.getValue());
			preOrder(root.getLeft(), list);
			preOrder(root.getRight(), list);
		}
	}

	@Override
	public List postOrder() {
		List<Integer> list = new LinkedListImplementation<Integer>();
		postOrder(root, list);
		return list;
	}

	private void postOrder(BinaryTreeNode root, List<Integer> list) {
		if (root != null) {
			postOrder(root.getLeft(), list);
			postOrder(root.getRight(), list);
			list.addItemAtTheEnd(root.getValue());
		}
	}

	@Override
	public void remove(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getHeight() {
		return height;
	}

}