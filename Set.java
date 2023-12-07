import java.util.List;
import java.util.ListIterator;

public class Set {
    public static <E> void set(List<E> list, int index, E element) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + list.size());
        }

        ListIterator<E> iterator = list.listIterator();
        for (int i = 0; i <= index; i++) {
            iterator.next();
        }
        iterator.set(element);
    }
}
