package aad.exercises;

import aad.datastructures.QueueCircularArray;

/**
 * Created by martin on 04/01/2015.
 */
public class QueueCircularExercise {

    public static void main(String[] args) {
        QueueCircularArray queue = new QueueCircularArray();

        queue.enqueue(new Integer(1));
        queue.enqueue(new Integer(2));
        queue.enqueue(new Integer(3));
        queue.enqueue(new Integer(4));
        queue.enqueue(new Integer(5));
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(new Integer(6));
        queue.enqueue(new Integer(7));
        queue.enqueue(new Integer(8));
        queue.enqueue(new Integer(9));
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(new Integer(10));
        queue.enqueue(new Integer(11));
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());




        return;
    }
}
