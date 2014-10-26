package aad.datastructures;
/**
 * queue
 * jre 1.6 or later required
 * @author Martin Zuber B00066378
 * @version 1.0
 * @param <T> any type
 */
public interface Queue<E> {
	
	/**
	 * determines whether a queue is empty
	 * @return true if queue is empty, false if not
	 */
	boolean isEmpty();
	
	/**
	 * adds newItem at the back of a queue
	 * @param newItem item to add
	 */
	void enqueue(E newItem);
	
	/**
	 * retrieves and removes the front of a queue
	 * @return removed item
	 * @throws RuntimeException if queue is already empty
	 */
	E dequeue( ) throws RuntimeException;
	
	/**
	 * remove all items from the queue
	 */
	void dequeueAll();
	
	/**
	 * retrieves the front of a queue, that is,
	 *  retrieves the item that was added earliest.
	 * The queue is unchanged
	 * @return item in the front
	 * @throws RuntimeException if queue is empty
	 */
	E peek() throws RuntimeException;
	
	/**
	 * describes the queue
	 * @return description of the queue (what items are in etc.)
	 */
	String toString();
}
