package aad.datastructures;

/**
 * int binnary tree interface jre 1.6 or later required
 * 
 * @author Martin Zuber B00066378
 * @version 1.0
 */
public interface BinaryTree {
	
	/**
	 * adds a value in the binary tree
	 * @param value any type
	 */
	void add(int value);
	
	/**
	 * returns true if binary tree contains the value
	 * @param value any type
	 * @return true or false
	 */
	boolean contains(int value);
	
	/**
	 * Returns List of binary tree values in order
	 * @return {@link List}
	 */
	List inOrder();
	
	/**
	 * Returns List of binary tree values pre order
	 * @return {@link List}
	 */
	List preOrder();
	
	/**
	 * Returns List of binary tree values post order
	 * @return {@link List}
	 */
	List postOrder();
	
	/**
	 * removes a value for binary tree
	 * @param value any type
	 */
	void remove(int value);
	
	/**
	 * returns height of the binary tree
	 * @return int height
	 */
	int height();
}
