package add.datastructures;
/**
 * Stack
 * jre 1.6 or later required
 * @author Martin Zuber B00066378
 * @version 1.0
 * @param <E> any type
 */
public interface Stack<E> {

	boolean isEmpty();
	void popAll();
	void push(E newItem);
	E pop() throws RuntimeException;
	E top() throws RuntimeException;
	String toString();
}
