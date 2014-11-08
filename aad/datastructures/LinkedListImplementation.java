package aad.datastructures;

/**
 * linked list implementation
 * jre 1.6 or later required
 * @author Martin Zuber B00066378
 * @version 1.0
 * @param <T> any type
 */
public class LinkedListImplementation<T> implements List<T>{
	
	private Node<T> head;
	private Node<T> tail;
	private int numItems;
	
	private void initializeList() {
		 
		head = null;
		tail = null;
		numItems = 0;
	}
	
	private Node<T> findNodeAtIndex(int index) {
		
		Node<T> resultNode = head;
		for (int i = 1; i < index; i++)	resultNode = resultNode.getNext();
		return resultNode;
	}

	//+++++++++++++++++ constructor ++++++++++++++++++++++++
	public LinkedListImplementation() { initializeList(); }
	
	/**
	 * returns first node in the list
	 * @return reference to the head of the list
	 */
	public Node<T> getHead() { return head; }
	
	/**
	 * returns last node int the list
	 * @return reference to tail node
	 */
	public Node<T> getTail() { return tail; }
	
	@Override
	public boolean isEmpty() { return numItems == 0; }
	
	@Override
	public int size() {	return numItems; }
	
	/**
	 * returns the node which is at the given position in the list
	 * @param position position of desired node
	 * @return reference to the node at given index
	 * @throws IllegalArgumentException if position < 1 or position > size()
	 */
	public Node<T> getNodeAtIndex(int index) throws IllegalArgumentException {
		
		if (index == 1) return head;
		if (index > 1 && index < size()) return findNodeAtIndex(index);
		if (index == size()) return tail;
	
		throw new IllegalArgumentException("index out of bound");
	}

	@Override
	public T getItemAtIndex(int index) throws IllegalArgumentException {
		
		return getNodeAtIndex(index).getItem();
	}
	
	@Override
	public void addItemAtTheBegining(T item) { addItem(1, item); }
	
	@Override
	public void addItemAtTheEnd(T item) { addItem(size() + 1, item); }

	private void setReferencesAfterAdding(Node<T> newNode, Node<T> previousNode, Node<T> nextNode) {
		
		newNode.setPrevious(previousNode);
		newNode.setNext(nextNode);
		previousNode.setNext(newNode);
		nextNode.setPrevious(newNode);
	}
	
	@Override
	public void addItem(int index, T item) throws IllegalArgumentException {

		//sanity check
		if(index < 1 || index > size() + 1)
			throw new IllegalArgumentException("index out of bound");
			
		Node<T> newNode = new NodeImplementation<T>(item);
		
		if(isEmpty()) { 
			//this adds new item on the beginning of empty list
			setReferencesAfterAdding(newNode, newNode, newNode);
			head = tail = newNode;
		}
		else if(index == 1) { 
			//this adds new item on the beginning of non-empty list
			setReferencesAfterAdding(newNode, tail, head);
			head = newNode;
			
		}
		else if(index == size() + 1) { 
			//this adds new item at the end of non-empty list
			setReferencesAfterAdding(newNode, tail, head);
			tail = newNode;
		}
		else if (index > 1 && index <= size() && !isEmpty()) { 
			//this adds new item somewhere in the middle of non-empty list
			Node<T> previousNode = findNodeAtIndex(index).getPrevious();
			Node<T> nextNode = previousNode.getNext();
			setReferencesAfterAdding(newNode, previousNode, nextNode);
		}

		numItems++;
	} // end add()
	
	@Override
	public void removeAllItems() { initializeList(); }
	
	@Override
	public void removeItemAtTheBegining() { removeNode(getHead()); }
	
	@Override
	public void removeItemAtTheEnd() { removeNode(getTail());}

	private void setReferencesAfterDeleting(Node<T> previousNode, Node<T> nextNode) {
		
		nextNode.setPrevious(previousNode);
		previousNode.setNext(nextNode);
	}
	
	@Override
	public void removeItemAtIndex(int index) throws RuntimeException, IllegalArgumentException {
		
		//sanity checks
		if(index < 1 || index > size())	throw new IllegalArgumentException("index out of bound");
		if(isEmpty()) throw new RuntimeException("list is empty");
		
		if(size() == 1) {
			//this removes first (last) item in the list with one item in it;
			removeAllItems();
			return;
		}else if(index == 1) {
			//this removes first item in the list with two or more items in it
			head = head.getNext();
			setReferencesAfterDeleting(tail, head);
		}
		else if(index == size()) {
			//this removes last item in list with two or more items in it
			tail = tail.getPrevious();
			setReferencesAfterDeleting(tail, head);
		}
		else if (index > 1 && index < size()) {
			//this removes item from middle of the list which have more than 2 items in it
			Node<T> previousNode = findNodeAtIndex(index).getPrevious();
			Node<T> nextNode = previousNode.getNext().getNext();
			setReferencesAfterDeleting(previousNode, nextNode);
		}
		
		numItems--;
	} // end remove()
	
	/**
	 * removes node from the list
	 * This method is weak and doesn't check if given node
	 * is actually in the list.
	 * Therefore this method can crush and throw various exceptions
	 * @param node reference to the node in the list
	 * @throws IllegalArgumentException if position < 1 or position > size()
	 * @throws RuntimeException if list is empty already
	 */
	public void removeNode(Node<T> node) throws IllegalArgumentException, RuntimeException {
		
		//sanity check
		if(node == null) throw new IllegalArgumentException("node is null");
		if (isEmpty()) throw new RuntimeException("list is empty");
		
		if(size() == 1) removeAllItems();
		else {
			Node<T> previousNode = node.getPrevious();
			Node<T> nextNode = node.getNext();
			setReferencesAfterDeleting(previousNode, nextNode);
			if(node == getHead()) head = nextNode;
			else if(node == getTail()) tail = previousNode;
			numItems--;
		}
	}//end removeNode()

	@Override
	public String toString() {

		if (isEmpty()) return "list(empty)\n";
		
		String output = "list(\n";
		Node<T> currentNode = head;
		for (int i = 1; i <= size(); i++) {
			output += "\t" + currentNode + "\n";
			currentNode = currentNode.getNext();
		}
		
		return output + ")size:" + size();
	}// end toString()
}//end LinkedListImplementation


