package aad.datastructures;

/**
 * circular two way list jre 1.6 or later required
 * 
 * @author Martin Zuber B00066378
 * @version 1.0
 * @param <T>
 *            any type
 */
public interface List<T> {

	/**
	 * @return true if the list contains no items
	 */
	boolean isEmpty();

	/**
	 * @return number of items in the list
	 */
	int size();

	/**
	 * returns the item which is at the given position in the list
	 * @param position position of desired item
	 * @return desired item object
	 * @throws IllegalArgumentException if position < 1 or position > size()
	 */
	T getItemAtIndex(int position) throws IllegalArgumentException;

	/**
	 * adds an item on head of the list
	 * @param item an object of the list item type
	 */
	void addItemAtTheBegining(T item);

	/**
	 * adds an item at the tail of the list
	 * @param item an object of the list item type
	 */
	void addItemAtTheEnd(T item);

	/**
	 * adds an item into the list at given position
	 * It is possible to add item to size() + 1 position,
	 * that is for example:
	 * if list has 3 items in it we can add an item at 4th position. 
	 * @param position a desired position in the list
	 * @param item an abject of the list item type
	 * @throws IllegalArgumentException if position is < 1 or position > size() + 1
	 */
	void addItem(int position, T item) throws IllegalArgumentException;

	/**
	 * clears the list of all items
	 */
	void removeAllItems();

	/**
	 * removes item at the head of the list
	 * next item becomes the head afterwards
	 */
	void removeItemAtTheBegining();

	/**
	 * removes item at the tail of the list
	 * previous item becomes the tail afterwards
	 */
	void removeItemAtTheEnd();

	/**
	 * removes item which is at given position in the list
	 * @param position a desired position
	 * @throws IllegalArgumentException if position < 1 or position > size()
	 * @throws RuntimeException if list is empty already
	 */
	void removeItemAtIndex(int position) throws IllegalArgumentException,
			RuntimeException;

	/**
	 * describes the list
	 * @return a string which list items etc...
	 */
	String toString();

}
