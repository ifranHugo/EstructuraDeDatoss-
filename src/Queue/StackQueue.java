package Queue;

import java.util.NoSuchElementException;

public interface StackQueue<E> {
    public void enqueue(E element);

    public E dequeue()throws NoSuchElementException;

    public E front()throws  NoSuchElementException;

    public boolean isEmpty();

    public int size();
}
