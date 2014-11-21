package aad.datastructures;

/**
 * binary tree node
 * @author Martin Zuber JRE 1.6 required
 * @version 1.0
 * @param <T> any type
 */
public interface BinaryTreeNode<T> {
	
	/**
	 * returns value stored in the node
	 * @return T
	 */
	T getValue();
	
	/**
	 * sets value of the node
	 * @param value any type
	 */
	void setValue(T value);
	
	/**
	 * returns left subtree root
	 * @return {@link BinaryTreeNode}
	 */
	BinaryTreeNode<T> left();
	
	/**
	 * returns right subtree root
	 * @return {@link BinaryTreeNode}
	 */
	BinaryTreeNode<T> right();
	
	/**
	 * sets left subtree root
	 * @param left {@link BinaryTreeNode}
	 */
	void setLeft(BinaryTreeNode<T> left);
	
	/**
	 * sets right subtree root
	 * @param right {@link BinaryTreeNode}
	 */
	void setRight(BinaryTreeNode<T> right);
}
