import java.util.List;
import java.util.ListIterator;

public class Get {
    public static <E> E get(List<E> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + list.size());
        }

        ListIterator<E> iterator = list.listIterator();
        E element = null;
        for (int i = 0; i <= index; i++) {
            element = iterator.next();
        }
        return element;
    }

    // Main method for testing (if needed)
}
