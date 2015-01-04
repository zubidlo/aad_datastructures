package aad.datastructures;

/**
 * Created by martin on 04/01/2015.
 */
public class QueueCircularArray implements Queue {

    private static final int MAX = 10;
    private Object[] array = new Object[MAX];
    private int count = 0;
    private int dequeuePos;
    private int enqueuePos;

    private void init() {
        array = new Object[MAX];
        count = 0;
        dequeuePos = 0;
        enqueuePos = 0;
    }

    public QueueCircularArray() {
        init();
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void enqueue(Object newItem) {
        if (count >= MAX) {
            System.err.println("queue is full");
            return;
        }

        if (!isEmpty()) {
            enqueuePos = ++enqueuePos % MAX;

        }

        array[enqueuePos] = newItem;
        count++;
    }

    @Override
    public Object dequeue() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        Object result = array[dequeuePos];
        array[dequeuePos] = null;
        dequeuePos = ++dequeuePos % MAX;
        count--;
        return result;
    }

    @Override
    public void dequeueAll() {
       init();
    }

    @Override
    public Object peek() throws RuntimeException {
        return array[dequeuePos];
    }
}
