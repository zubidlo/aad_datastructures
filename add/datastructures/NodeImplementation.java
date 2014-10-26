package add.datastructures;
/**
 * @author Martin Zuber
 * JRE 1.6 required
 * @version 1.0
 * @param <T> any type
 */
public class NodeImplementation<T> implements Node<T> {
	
	//++++++++++++++ private fields ++++++++++++++++
	private T item;
	private Node<T> next;
	private Node<T> previous;

	//++++++++++++++ constructor +++++++++++++++++++
	public NodeImplementation(T newItem) { item = newItem; }
	
	//++++++++++++++ interface methods +++++++++++++
	@Override
	public T getItem() { return item; }
	
	@Override
	public void setItem(T newItem) { item = newItem; }
	
	@Override
	public Node<T> getPrevious() { return previous; }
	
	@Override
	public void setPrevious(Node<T> prevNode) { previous = prevNode; }
	
	@Override
	public Node<T> getNext() { return next; }
	
	@Override
	public void setNext(Node<T> nextNode) { next = nextNode; }
	
	@Override
	public boolean equals(Node<T> other) { return  getItem() == other.getItem(); }
	
	@Override
	public String toString() {
		String previousItem, thisItem, nextItem;
		previousItem = (previous == null) ? "null" : previous.getItem().toString();
		thisItem = getItem().toString();
		nextItem = (next == null) ? "null" : next.getItem().toString();
		return "(" + thisItem + ",<--"+ previousItem + "," + "-->" + nextItem+")";
	}
}