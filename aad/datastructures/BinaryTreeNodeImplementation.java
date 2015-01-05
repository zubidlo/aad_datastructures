package aad.datastructures;

/**
 * Created by martin on 04/01/2015.
 */
public class BinaryTreeNodeImplementation implements BinaryTreeNode {

    private int value;
    private BinaryTreeNode leftNode, rightNode;

    public BinaryTreeNodeImplementation(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public BinaryTreeNode getLeft() {
        return leftNode;
    }

    @Override
    public BinaryTreeNode getRight() {
        return rightNode;
    }

    @Override
    public void setLeft(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    @Override
    public void setRight(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
