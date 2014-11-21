/**
 * 
 */
package aad.datastructures;

/**
 * binary tree node implementation
 * @author Martin Zuber JRE 1.6 required
 * @version 1.0
 * @param <T> any type
 */
public class BinaryNodeImplementation<T> implements BinaryTreeNode<T> {

	private T value;
	private BinaryTreeNode<T> left, right;
	
	public BinaryNodeImplementation(T value) { this.value = value; }
	
	@Override
	public T getValue() { return value; }

	@Override
	public void setValue(T value) {	this.value = value; }

	@Override
	public BinaryTreeNode<T> left() { return left; }

	@Override
	public BinaryTreeNode<T> right() { return right; }

	@Override
	public void setLeft(BinaryTreeNode<T> left) { this.left = left;	}

	@Override
	public void setRight(BinaryTreeNode<T> right) {	this.right = right;	}

}
