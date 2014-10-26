package aad.datastructures;
/**
 * circular two way list
 * jre 1.6 or later required
 * @author Martin Zuber B00066378
 * @version 1.0
 * @param <T> any type
 */
public interface List<T> {

	Node<T> getHead();
	Node<T> getTail();
	boolean isEmpty();
	int size();
	Node<T> getNodeAtIndex(int index) throws IllegalArgumentException;
	T getItemAtIndex(int index) throws IllegalArgumentException;
	void addItemAtTheBegining(T item);
	void addItemAtTheEnd(T item);
	void addItem(int index, T item) throws IllegalArgumentException;
	void removeAllItems();
	void removeItemAtTheBegining();
	void removeItemAtTheEnd();
	void removeItemAtIndex(int index) throws IllegalArgumentException, RuntimeException;
	void removeNode(Node<T> node) throws IllegalArgumentException, RuntimeException;
	String toString();
	
}
