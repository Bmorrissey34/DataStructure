import java.util.LinkedList;
import java.util.EmptyStackException;

public class LinkedListStack<E> {
    private LinkedList<E> backingList;

    public LinkedListStack() {
        backingList = new LinkedList<>();
    }

    public void push(E e) {
        backingList.addFirst(e);
    }

    public E pop() {
        if (backingList.isEmpty()) {
            throw new EmptyStackException();
        }
        return backingList.removeFirst();
    }

    public E peek() {
        if (backingList.isEmpty()) {
            throw new EmptyStackException();
        }
        return backingList.getFirst();
    }
}
