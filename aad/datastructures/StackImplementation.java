package aad.datastructures;
/**
 * Generic Stack implementation using linked list 
 * jre 1.6 or later required
 * @author Martin Zuber B00066378
 * @version 1.0
 * @param <E> any type
 */
public class StackImplementation<E> implements Stack<E>{

	private List<E> list;
	
	public StackImplementation() { list = new LinkedListImplementation<E>(); }

	@Override
	public boolean isEmpty() { return list.isEmpty(); }

	@Override
	public void popAll() { list = new LinkedListImplementation<E>(); }

	@Override
	public void push(E newItem) { list.addItemAtTheEnd(newItem); }

	@Override
	public E pop() throws RuntimeException {
		
		E lastItem = top();
		list.removeItemAtTheEnd();
		return lastItem;
	}

	@Override
	public E top() throws RuntimeException {
		
		if (list.isEmpty()) {
			throw new RuntimeException("stack is empty");
		}
		return list.getItemAtIndex(list.size());
	}
	
	@Override
	public String toString() { 
		
		if(isEmpty()) {
			return "stack(empty)";
		}
		return list.toString().replaceFirst("list", "stack");
	}
}
