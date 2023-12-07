import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedListInPlace {
    public static <E> void reverseLinkedListInPlace(LinkedList<E> list) {
        ListIterator<E> forward = list.listIterator();
        ListIterator<E> backward = list.listIterator(list.size());

        for (int i = 0, mid = list.size() / 2; i < mid; i++) {
            E temp = forward.next();
            forward.set(backward.previous());
            backward.set(temp);
        }
    }
}
