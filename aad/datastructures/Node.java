package aad.datastructures;

/**
 * two way node
 * @author Martin Zuber JRE 1.6 required
 * @version 1.0
 * @param <T>
 *            any type
 */
public interface Node<T> {
	
	/**
	 * @return this node item
	 */
	T getItem();

	/**
	 * @param newItem item of node type
	 */
	void setItem(T newItem);

	/**
	 * @return reference to previous node
	 */
	Node<T> getPrevious();

	/**
	 * sets reference to previous node
	 * @param prevNode given previous node
	 */
	void setPrevious(Node<T> prevNode);

	/**
	 * @return reference to next node
	 */
	Node<T> getNext();

	/**
	 * sets reference to next node
	 * @param nextNode given next node
	 */
	void setNext(Node<T> nextNode);

	/**
	 * compares this nodes with other node
	 * nodes are equal if their items are equal
	 * @param other some other node reference
	 * @return true if items of the nodes are equal
	 */
	boolean equals(Node<T> other);

	/**
	 * describes node
	 * @return a string
	 */
	String toString();
}
