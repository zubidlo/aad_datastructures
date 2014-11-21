package aad.datastructures;

/**
 * binnary tree interface jre 1.6 or later required
 * 
 * @author Martin Zuber B00066378
 * @version 1.0
 * @param <T>
 *            any type
 */
public interface BinaryTree<T> {
	
	/**
	 * adds a value in the binary tree
	 * @param value any type
	 */
	void add(T value);
	
	/**
	 * returns true if binary tree contains the value
	 * @param value any type
	 * @return true or false
	 */
	boolean contains(T value);
	
	/**
	 * Returns List of binary tree values in order
	 * @return {@link List}
	 */
	List<T> inOrder();
	
	/**
	 * Returns List of binary tree values pre order
	 * @return {@link List}
	 */
	List<T> preOrder();
	
	/**
	 * Returns List of binary tree values post order
	 * @return {@link List}
	 */
	List<T> postOrder();
	
	/**
	 * removes a value for binary tree
	 * @param value any type
	 */
	void remove(T value);
	
	/**
	 * returns height of the binary tree
	 * @return int height
	 */
	int height();
}
