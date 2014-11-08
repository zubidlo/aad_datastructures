package aad.datastructures;
import java.util.Arrays;

/**
 * linked list implementation using array
 * jre 1.6 or later required
 * @author Martin Zuber B00066378
 * @version 1.0
 * @param <T> any type
 */
public class ArrayListImlementation<T> implements List<T> {

	private static final int MAX_INDEX = 50;
	private T[] items;
	private int numItems;
	
	private int translate(int index) { return index - 1; }
	
	private boolean isOutOfBound(int index) { return index < 1 || index > numItems;	}
	
	@SuppressWarnings("unchecked")
	private void initialize() {
		
		items = (T[]) new Object [MAX_INDEX];
		numItems = 0;
	}
	
	public ArrayListImlementation() { initialize();	}
	
	@Override
	public boolean isEmpty() { return numItems == 0 ? true : false; }

	@Override
	public int size() {	return numItems; }

	@Override
	public void addItem(int position, T item) throws IllegalArgumentException {
		
		//sanity check: list is full
		if (numItems == MAX_INDEX) {
			throw new RuntimeException("list is full");
		}
			
		//sanity check: index out of bound
		if (position < 1 || position > numItems + 1) {
			throw new IllegalArgumentException("insertion allowed only between: <1," + (numItems + 1) + ">");
		}
			
		//common case: loop is not going to execute if numItems < index
		for(int i = numItems; i >= position; i--) {
			items[translate(i+1)] = items[translate(i)];
		}
		
		items[translate(position)] = item;
		numItems++;
	}
	
	@Override
	public T getItemAtIndex(int position) throws IllegalArgumentException {

		if (isOutOfBound(position)) {
			throw new IllegalArgumentException("index out of <1," + numItems + ">");
		}
			
		return items[translate(position)];
	}

	@Override
	public void addItemAtTheBegining(T item) { addItem(1, item); }

	@Override
	public void addItemAtTheEnd(T item) { addItem(numItems + 1, item); }

	@Override
	public void removeAllItems() { if (!isEmpty()) { initialize(); } }

	@Override
	public void removeItemAtIndex(int position)	throws IllegalArgumentException, RuntimeException {
		
		//sanity check: list is empty
		if (isEmpty()) {
			throw new RuntimeException("nothing to remove, because list is empty");
		}
		
		//sanity checks: index out of bound
		if (isOutOfBound(position)) {
			throw new IllegalArgumentException("index out of <1," + numItems + ">");
		}
		
		//common case: loop is not going to execute if index = numItems
		for(int i = position; i < numItems; i++) {
			items[translate(i)] = items[translate(i + 1)];
		}
		
		items[translate(numItems)] = null;
		numItems--;		
	}	
	
	@Override
	public void removeItemAtTheBegining() { removeItemAtIndex(1); }

	@Override
	public void removeItemAtTheEnd() { removeItemAtIndex(numItems);	}

	@Override
	public String toString() {
		
		return "list:\n" + Arrays.toString(items) + "\nsize:" + numItems + "\n";
	}
}
