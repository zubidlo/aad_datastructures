package aad.datastructures;
/**
 * Stack
 * jre 1.6 or later required
 * @author Martin Zuber B00066378
 * @version 1.0
 * @param <E> any type
 */
public interface Stack<E> {

	/**
	 * determines if the stack is empty
	 * @return true if stack is empty, false if is not
	 */
	boolean isEmpty();
	
	/**
	 * deletes all items from the stack
	 */
	void popAll();
	
	/**
	 * inserts new item on the top of the stack
	 * @param newItem item to insert
	 */
	void push(E newItem);
	
	/**
	 * removes item from top of the stack
	 * @return reference to removed item
	 * @throws RuntimeException if stack is empty already
	 */
	E pop() throws RuntimeException;
	
	/**
	 * returns item on the top of the stack
	 * The stack is unchanged
	 * @return reference to top item
	 * @throws RuntimeException if the stack s empty
	 */
	E top() throws RuntimeException;
	
	/**
	 * describes the stack
	 * @return description of the stack (what items are in etc.)
	 */
	String toString();
}
