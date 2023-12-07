import java.util.List;
import java.util.ListIterator;

public class IndexOfElement {
    public static <E> int indexOf(List<E> list, E element) {
        ListIterator<E> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (element == null ? iterator.next() == null : element.equals(iterator.next())) {
                return iterator.previousIndex();
            }
        }
        return -1;
    }
}
