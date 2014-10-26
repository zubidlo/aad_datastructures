package aad.datastructures;
/**
 * two way node
 * @author Martin Zuber
 * JRE 1.6 required
 * @version 1.0
 * @param <T> any type
 */
 public interface Node<T> {
	
	T getItem();
	void setItem(T newItem);
	Node<T> getPrevious();
	void setPrevious(Node<T> prevNode);
	Node<T> getNext();
	void setNext(Node<T> nextNode);
	boolean equals(Node<T> other);
	String toString();
}
