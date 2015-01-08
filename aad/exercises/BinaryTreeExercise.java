package aad.exercises;

import aad.datastructures.BinaryTree;
import aad.datastructures.BinaryTreeImplementation;

/**
 * Created by martin on 04/01/2015.
 */
public class BinaryTreeExercise {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTreeImplementation();

        tree.add(10);
        tree.add(8);
        tree.add(15);
        tree.add(16);
        tree.add(12);
        tree.add(4);
        tree.add(5);
        tree.add(1);
        tree.add(6);
        tree.add(10);

        tree.remove(12);
        System.out.println(tree.preOrder());
        System.out.print(tree.getHeight());

        return;
    }
}
