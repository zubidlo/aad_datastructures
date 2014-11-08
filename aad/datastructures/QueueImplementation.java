package aad.datastructures;

public class QueueImplementation<E> implements Queue<E> {

	private LinkedListImplementation<E> list;
	
	public QueueImplementation() { list = new LinkedListImplementation<E>(); }
	
	@Override
	public boolean isEmpty() { return list.isEmpty(); }

	@Override
	public void enqueue(E newItem) { list.addItemAtTheBegining(newItem); }

	@Override
	public E dequeue() throws RuntimeException {
		
		if (list.isEmpty()) {
			throw new RuntimeException("can't dequeue item from empty queue");
		}
		E item = list.getItemAtIndex(list.size());
		list.removeItemAtTheEnd();
		return item;
	}

	@Override
	public void dequeueAll() { list = new LinkedListImplementation<E>(); }

	@Override
	public E peek() throws RuntimeException {
		
		if (list.isEmpty()) {
			throw new RuntimeException("can't peek item from empty queue");
		}
		return list.getTail().getItem();
	}
	
	@Override
	public String toString() { 
		
		if(isEmpty()) {
			return "queue(empty)";
		}
		return list.toString().replaceFirst("list", "queue");
	}
}
