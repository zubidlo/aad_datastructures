package aad.datastructures;

/**
 * int binary tree node
 * @author Martin Zuber JRE 1.6 required
 * @version 1.0
 * @param int
 */
public interface BinaryTreeNode {
	
	/**
	 * returns value stored in the node
	 * @return T
	 */
	int getValue();
	
	/**
	 * sets value of the node
	 * @param value any type
	 */
	void setValue(int value);
	
	/**
	 * returns left subtree root
	 * @return {@link BinaryTreeNode}
	 */
	BinaryTreeNode getLeft();
	
	/**
	 * returns right subtree root
	 * @return {@link BinaryTreeNode}
	 */
	BinaryTreeNode getRight();
	
	/**
	 * sets left subtree root
	 * @param left {@link BinaryTreeNode}
	 */
	void setLeft(BinaryTreeNode left);
	
	/**
	 * sets right subtree root
	 * @param right {@link BinaryTreeNode}
	 */
	void setRight(BinaryTreeNode right);
}
