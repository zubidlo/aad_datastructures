/**
 * 
 */
package aad.datastructures;

/**
 * binary tree node implementation
 * @author Martin Zuber JRE 1.6 required
 * @version 1.0
 * @param
 */
public class BinaryNodeImplementation implements BinaryTreeNode {

	private int value;
	private BinaryTreeNode left, right;
	
	public BinaryNodeImplementation(int value) {
		this.value = value;
	}


	@Override
	public int getValue() {
		return value;
	}

	@Override
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public BinaryTreeNode getLeft() {
		return left;
	}

	@Override
	public BinaryTreeNode getRight() {
		return right;
	}

	@Override
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	@Override
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

}
