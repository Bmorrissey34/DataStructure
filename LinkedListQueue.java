import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListQueue<E> {
    private LinkedList<E> backingList;

    public LinkedListQueue() {
        backingList = new LinkedList<>();
    }

    public void add(E e) {
        backingList.addLast(e);
    }

    public E remove() {
        if (backingList.isEmpty()) {
            throw new NoSuchElementException();
        }
        return backingList.removeFirst();
    }

    public E peekHead() {
        if (backingList.isEmpty()) {
            throw new NoSuchElementException();
        }
        return backingList.getFirst();
    }

    public E peekTail() {
        if (backingList.isEmpty()) {
            throw new NoSuchElementException();
        }
        return backingList.getLast();
    }
}
