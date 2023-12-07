import java.util.List;
import java.util.ListIterator;

public class Remove {
        public static <E> E remove(List<E> list, int index) {
            if (index < 0 || index >= list.size()) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + list.size());
            }

            ListIterator<E> iterator = list.listIterator();
            E removedElement = null;
            for (int i = 0; i <= index; i++) {
                removedElement = iterator.next();
            }
            iterator.remove();
            return removedElement;
        }
    }